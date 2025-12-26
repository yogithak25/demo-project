pipeline {
    agent any
    options {
        timeout(time: 10, unit: 'MINUTES' )
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/yogithak25/demo-project.git'
                
            }
        }
        stage('build') {
            steps {
                sh './build.sh'
            }
        }
    }
}
