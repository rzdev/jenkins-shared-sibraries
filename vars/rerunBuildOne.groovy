def call(buildId, jobName) {
    if ("${buildId}" == "1") {
        build job: "${jobName}", wait: false
        currentBuild.result = 'ABORTED'
        error("Skipping build ${buildId} as it doesn't play nice with bitbucket notifications")
    }
}