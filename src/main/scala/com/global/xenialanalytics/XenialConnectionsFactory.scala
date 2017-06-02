package com.global.xenialanalytics

/**
  * Created by lausena on 6/2/17.
  */
object XenialConnectionsFactory {
  def apply(databaseType: String) = databaseType.toUpperCase match {
    case "CASSANDRA" => new CassandraConnection
  }
}
