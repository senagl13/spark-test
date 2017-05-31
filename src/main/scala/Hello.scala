/**
  * Created by lausena on 5/31/17.
  */
//import com.datastax.spark.connector._, org.apache.spark.SparkContext, org.apache.spark.SparkContext._, org.apache.spark.SparkConf
import org.apache.spark.{SparkConf, SparkContext}
import com.datastax.spark.connector._
import org.apache.spark.sql.cassandra._

object Hello extends App {
  def sayHello(name: String) = "Hello, Scala!"

//  val conf = new SparkConf(true).set("spark.cassandra.connection.host", "localhost")
  val conf = new SparkConf()
    .setMaster("local[*]")
    .setAppName("SparkCassandra")
    .set("spark.cassandra.connection.host", "127.0.0.1")
  val sc = new SparkContext(conf)
  //get table from keyspace and stored as rdd
  val rdd = sc.cassandraTable("test", "kv")
  //collect will dump the whole rdd data to driver node (here's our machine),
  //which may crush the machine. So take first 100 (for now we use small table
  //so it's ok)
  val file_collect = rdd.collect().take(2)
  file_collect.foreach(println(_))
//  val sc = new SparkContext(conf)
//  val rdd = sc.cassandraTable("test", "kv")
//  println(rdd.count)
//  println(rdd.first)
//  println(rdd.map(_.getInt("value")).sum)
  sc.stop()
}
