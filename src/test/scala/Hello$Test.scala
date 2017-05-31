import org.scalatest.FunSuite

/**
  * Created by lausena on 5/31/17.
  */
class Hello$Test extends FunSuite {
  test("sayHello method works correctly") {
    assert(Hello.sayHello("Scala") == "Hello, Scala!")
  }
}