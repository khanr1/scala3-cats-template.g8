package $package; format = "lower,package" $
package $name; format = "lower,word" $

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple:
  val run = IO.println(Console.GREEN + "Hello" + Console.RESET)
