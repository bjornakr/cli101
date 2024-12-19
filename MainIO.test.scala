class MainIoTest extends munit.CatsEffectSuite:

   test("IO(upAndRunning)") {
      assert(true).pure[IO]
   }
