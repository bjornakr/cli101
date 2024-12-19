//> using scala "3.6"

//> using options -source:future -language:experimental.namedTuples
//> using options -experimental -language:experimental.betterFors

//> using dep "org.typelevel::cats-core:2.12.0"
//> using dep "org.typelevel::cats-effect:3.5.7"
//> using dep "io.circe::circe-core:0.14.10",
//> using dep "io.circe::circe-generic:0.14.10",
//> using dep "io.circe::circe-parser:0.14.10",
//> using dep "io.circe::circe-literal:0.14.10",

//> using dep "io.github.kitlangton::neotype:0.3.8"

//> using test.dep "org.typelevel::munit-cats-effect:2.0.0"

export scala.util.chaining.*
export cats.syntax.all.*
export cats.effect.{IO, IOApp}
export cats.effect.unsafe.implicits.*

export io.circe.syntax.EncoderOps
export io.circe.literal.json
export NeoCirceInterop.given

extension[A] (self: IO[A]) def run(): A = self.unsafeRunSync()

def parseJson(input: String): io.circe.Json = io.circe.parser.parse(input).toTry.get