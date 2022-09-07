pipeline {
    agent { docker { image 'gradle:7.5.1' } }
      stages {
        stage('log version info') {
      steps {
        sh 'gradle --version'
        sh 'clean build'
      }
    }
  }
}