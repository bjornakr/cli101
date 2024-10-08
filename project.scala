//> using scala "3.5"

//> using options -source:future -language:experimental.modularity
//> using options -source:future -language:experimental.namedTuples

//> using dep "org.typelevel::cats-core:2.12.0"
//> using dep "org.typelevel::cats-effect:3.5.4"
//> using dep "io.circe::circe-core:0.14.9",
//> using dep "io.circe::circe-generic:0.14.9",
//> using dep "io.circe::circe-parser:0.14.9",
//> using dep "io.circe::circe-literal:0.14.9",

//> using dep "com.lihaoyi::os-lib:0.10.4"
//> using dep "com.lihaoyi::requests:0.9.0"

//> using test.dep "org.typelevel::munit-cats-effect:2.0.0"

export scala.util.chaining.*
export cats.syntax.all.*
export cats.effect.{IO, IOApp}
export cats.effect.unsafe.implicits.*

extension[A] (self: IO[A]) def run(): A = self.unsafeRunSync()

def parseJson(input: String): io.circe.Json = io.circe.parser.parse(input).toTry.get