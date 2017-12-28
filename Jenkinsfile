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
    stage('analysis') {
      steps {
        withSonarQubeEnv('sq') {
          script {
            if(env.CHANGE_ID) {
              sh """
              mvn sonar:sonar -Dsonar.analysis.mode=preview \
                -Dsonar.github.pullRequest=${env.CHANGE_ID} \
                -Dsonar.github.repository=srcibex/sbqs \
                -Dsonar.github.oauth=${env.SQ_TKN}
              """
            } else {
              sh 'mvn sonar:sonar'
            }
          }
        }
      }
    }
  }
}
