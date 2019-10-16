/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package com.jetbrains.konan

import com.intellij.execution.ExecutionException
import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.configurations.PtyCommandLine
import com.intellij.execution.filters.DefaultConsoleFiltersProvider
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.util.ThrowableComputable
import com.intellij.xdebugger.XDebugProcess
import com.intellij.xdebugger.XDebugSession
import com.jetbrains.cidr.execution.TrivialRunParameters
import com.jetbrains.cidr.system.LocalHost
import com.jetbrains.konan.debugger.KonanLLDBDriverConfiguration
import com.jetbrains.konan.debugger.KonanLocalDebugProcess
import java.io.File

class KonanCommandLineState(
    env: ExecutionEnvironment,
    val configuration: IdeaKonanRunConfiguration,
    private val runFile: File
) : CommandLineState(env) {
    private fun usePty(): Boolean {
        val application = ApplicationManager.getApplication()
        return PtyCommandLine.isEnabled() || application.isInternal || application.isUnitTestMode
    }

    @Throws(ExecutionException::class)
    private fun createCommandLine(usePty: Boolean): GeneralCommandLine {
        return ApplicationManager.getApplication().runReadAction(ThrowableComputable<GeneralCommandLine, ExecutionException> {
            val cl: GeneralCommandLine = if (usePty) PtyCommandLine() else GeneralCommandLine()
            KonanLLDBInstaller(runFile, configuration).configureCommandLine(cl)
            cl
        })
    }

    @Throws(ExecutionException::class)
    fun startDebugProcess(session: XDebugSession): XDebugProcess {
        val workspace = IdeaKonanWorkspace.getInstance(configuration.project)
        val installer = KonanLLDBInstaller(runFile, configuration)
        val lldbConfiguration = KonanLLDBDriverConfiguration(workspace.lldbHome)
        val result = KonanLocalDebugProcess(
            TrivialRunParameters(lldbConfiguration, installer),
            session,
            consoleBuilder,
            DefaultConsoleFiltersProvider()
        )
        result.start()
        return result
    }

    @Throws(ExecutionException::class)
    override fun startProcess(): ProcessHandler {
        val usePty = usePty()
        val cl = createCommandLine(usePty)
        return LocalHost.INSTANCE.createProcess(cl, true, usePty)
    }
}