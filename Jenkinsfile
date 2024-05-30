pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                script {
                    // Utiliza el comando `mvn` para ejecutar tus metas de Maven
                    def mvnHome = tool 'Maven'
                    def mvnCmd = "${mvnHome}/bin/mvn"
                    sh "${mvnCmd} clean compile"
                }
            }
        }
    }
}
