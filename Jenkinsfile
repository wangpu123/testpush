#!groovy

@Library('testpush') _

def tools = new org.devops.tools()

pipeline{
agent{
    node{
      label 'master'
    }
  }
  stages{
    stage('test'){
      steps{
        script{
          println(666)
          tools.PrintMsg("this")
        }
      }
    }
  }
}
