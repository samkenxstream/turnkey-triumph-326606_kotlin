Pod::Spec.new do |spec|
    spec.name                     = 'pod4'
    spec.version                  = '1.0'
    spec.homepage                 = 'repro'
    spec.source                   = { :git => "Not Published", :tag => "Cocoapods/#{spec.name}/#{spec.version}" }
    spec.authors                  = ''
    spec.license                  = ''
    spec.summary                  = 'repro'

    spec.dependency 'pod2'
    spec.dependency 'pod3'

    spec.swift_version = '5.0'
    spec.source_files = '*.swift'
end
