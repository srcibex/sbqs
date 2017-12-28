pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'printenv'
        sh 'mvn package'
      }
    }
  }
}
