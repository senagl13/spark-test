package com.global.xenialanalytics
import com.datastax.spark.connector._
/**
  * Created by lausena on 5/31/17.
  */
object XenialCassandraSpark extends App {

  def sayHello(name: String) = "Hello, Scala!"

  val cassandraConn = XenialConnectionsFactory(databaseType = "cassandra")

  val context = cassandraConn.getContext
  val rdd = context.cassandraTable("insights", "merchant_demographic")
  println(rdd.count)
  context.stop()
}