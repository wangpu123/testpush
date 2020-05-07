package org.devops

//构建类型

def Build(buildType,buildShell){
  def buildTools = ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
  buildHome = tool buildTools[buildType]
  println("当前构件类型为${buildType}")
  sh "${buildHome}/bin/${buildType} ${buildShell}"
}
