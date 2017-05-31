name := "xenial-scala-application"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1"

resolvers += "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0"