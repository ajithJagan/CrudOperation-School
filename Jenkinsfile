pipeline {
    agent { docker { image 'gradle:3.3.3' } }
      stages {
        stage('log version info') {
      steps {
        sh 'gradle --version'
        sh 'clean build'
      }
    }
  }
}