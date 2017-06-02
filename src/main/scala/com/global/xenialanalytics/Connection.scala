package com.global.xenialanalytics

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by lausena on 6/2/17.
  */
trait Connection {
  def getContext: SparkContext
}

class CassandraConnection extends Connection {
  def getContext: SparkContext = {
    val conf = new SparkConf(true)
      .setMaster("local[1]")
      .setAppName("SparkCassandra")
      .set("spark.cassandra.connection.host", "localhost")

    new SparkContext(conf)
  }
}