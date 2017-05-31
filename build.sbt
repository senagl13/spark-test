name := "xenial-scala-application"

version := "1.0"



//exportJars := true
//
//lazy val root = (project in file(".")).
//  settings(
//    name := "cassandra20",
//    version := "1.0",
//    scalaVersion := "2.11.8",
//    mainClass in (Compile, packageBin) := Some("main.scala.cassandra20.new_object")
//  )
//
//sparkVersion := "2.0.0" // the Spark Version your package depends on.
//
//libraryDependencies ++= Seq(
//  "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0-M3"
//)
//sparkComponents ++= Seq("streaming", "sql", "hive", "mllib")




scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0-M3"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"






//scalaVersion := "2.10.5"
//
//libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.4.0"
//
//libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector_2.10" % "1.4.0-M1"
//
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"






//scalaVersion := "2.11.7"
//
//libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"
//
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//
//resolvers += "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven"
//
//libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0"