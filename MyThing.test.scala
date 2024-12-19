class MyThingTest extends munit.FunSuite:

   test("hello") {
      val myThing = MyThing(1)
      val json    = myThing.asJson
      assertEquals(json, json"1")
   }
