/**
  * Created by lausena on 5/31/17.
  */
import com.datastax.spark.connector._
import org.apache.spark.sql.cassandra._

object Hello extends App {
  def sayHello(name: String) = "Hello, Scala!"
}
