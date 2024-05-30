pipeline {
    agent {
        docker {
            image 'maven:3.8.5-openjdk-11'
            args '-v /root/.m2:/root/.m2'
        }
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean compile'
            }
        }
    }
}