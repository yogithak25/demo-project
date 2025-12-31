def call() {

    pipeline {
        agent any
        tools {
            maven 'maven-3'
        }
        stages {
            stage('Build') {
                steps {
                    sh 'mvn clean package -DskipTests'
                }
            }
            stage('Test') {
                steps {
                    sh 'mvn test'
                }
            }
            stage('Deploy to Nexus') {
                steps {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
