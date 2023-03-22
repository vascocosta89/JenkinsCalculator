pipeline {
    agent any 
    stages {
        stage('Cleaning Stage') { 
            steps {
                echo "entering cleaning stage"
                sh "mvn clean" 
            }
        }
        stage('Testing Stage') { 
            steps {
               echo "entering Testing stage"
               sh "mvn test" 
            }
        }
        stage('Packaging Stage') { 
            steps {
               echo "entering Packaging stage"
               sh "mvn package" 
            }
        }
        stage("Consolidate Results"){
            steps {  
            input("Do you want to capture results?")
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'
        }
    }
}
