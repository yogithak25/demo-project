pipeline {
    agent any
    options {
        timeout(time: 10, unit: 'MINUTES' )
    }
    stages {
        stage('build') {
            steps {
                sh './build.sh'
            }
        }
    }
}
