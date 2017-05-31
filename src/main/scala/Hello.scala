/**
  * Created by lausena on 5/31/17.
  */
//import com.datastax.spark.connector._, org.apache.spark.SparkContext, org.apache.spark.SparkContext._, org.apache.spark.SparkConf
import org.apache.spark.{SparkConf, SparkContext}
import com.datastax.spark.connector.cql._
import com.datastax.spark.connector._
import org.apache.spark.sql.cassandra._

object Hello extends App {
  def sayHello(name: String) = "Hello, Scala!"

  val conf = new SparkConf(true)
    .setMaster("local[1]")
    .setAppName("SparkCassandra")
    .set("spark.cassandra.connection.host", "localhost")
  val sc = new SparkContext(conf)
  val rdd = sc.cassandraTable("insights", "merchant_demographic")
  println(rdd.count)
  sc.stop()
}