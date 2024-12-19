import neotype.*

opaque type MyThing = Int

object MyThing extends Newtype[Int]:
   override inline def validate(i: Int): Boolean =
      i >= 0