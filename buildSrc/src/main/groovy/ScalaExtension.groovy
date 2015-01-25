package my

import org.gradle.api.Project

class ScalaExtension {

  String version = '2.10.4'
  List<String> components = ['library']
  
  ScalaExtension(Project project) {
    def versionSpecified = project.hasProperty('scalaVersion') 
    if (versionSpecified){
      version = project.getProperty('scalaVersion') as String
    }
    project.afterEvaluate { p ->
      p.dependencies {
	p.scala.components.each { component ->
	  compile "org.scala-lang:scala-$component:${p.scala.version}"	  
	}
      }
      if (versionSpecified){
	p.archivesBaseName += "_$binaryVersion"
      }
    }
  }

  def getBinaryVersion() {
    version.substring(0, 4)
  }
  
}
