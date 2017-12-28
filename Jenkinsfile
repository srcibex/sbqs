pipeline {
  agent any
  tools {
    maven 'maven3'
  }
  stages {
    stage('build') {
      steps {
        sh 'printenv'
        sh 'mvn package'
      }
    }
  }
}
