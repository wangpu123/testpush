#!groovy
@Libary("testpush") _
def tools = new org.devops.tools()

pipeline{
agent{
    node{
      label 'master'
    }
  }
  stages{
    stage{
      steps{
        script{
          println(666)
          tools.PrinMsg("this")
        }
      }
    }
  }
}
