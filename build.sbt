name := "dl4j-ui-server"

organization := "io.skymind"

version := "0.1.0"

scalaVersion := "2.10.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.3" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.6.3" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.3" % "provided"

// For CPU (Comment out to use the GPU)
libraryDependencies += "org.nd4j" % "nd4j-native-platform" % "0.9.1"

libraryDependencies += "org.deeplearning4j" %% "deeplearning4j-ui" % "0.9.1"

assemblyMergeStrategy in assembly := {
  case PathList(ps @ _*) if ps.last endsWith ".properties" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".xml" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".js" => MergeStrategy.last
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}

mainClass in assembly := Some("org.deeplearning4j.ui.play.PlayUIServer")
