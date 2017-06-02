package com.global.xenialanalytics

import org.scalatest.FunSuite

/**
  * Created by lausena on 6/2/17.
  */
class XenialCassandraSpark$Test extends FunSuite {

  test("Should test the sayHello method") {
    assert(XenialCassandraSpark.sayHello("Goodbye!") == "Hello, Scala!")
  }

}
