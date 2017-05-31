name := "xenial-scala-application"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

resolvers += "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0"