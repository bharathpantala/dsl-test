pipelineJob('job-dsl-plugin') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/bharathpantala/dsl-test.git')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}
