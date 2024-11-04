pipeline{
    agent any
    
    tools{
        maven "M3"
    }
  
    stages{
        stage('repo setup'){
            steps{
                git branch:'main', url:'https://github.com/ziyameng/bank.git'
            }
        }
      
        stage('build'){
            steps{
                sh "mvn clean compile"
            }
        }
        stage('test'){
            steps{
                sh 'mvn test'
            }
        }
    }
}
