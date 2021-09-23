job('hello') {
  steps {
    batchFile('echo Hello World!')
  }
}
job('hi') {
  steps {
    batchFile('echo Hello World!')
  }
}
