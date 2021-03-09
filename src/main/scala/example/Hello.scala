package example

import zio.console._
import FromScalaValues._

object Hello extends zio.App {
  def run(args: List[String]) = myAppLogic.exitCode

  val myAppLogic = 
    for {
      _ <- zOption.flatMap(i =>putStrLn(i.toString()))
      // _ <- putStrLn(zOptionNone)
      // _ <- putStrLn("Whats yo nombre eyyty")
      // name <- getStrLn
      // _ <- putStrLn(s"Hola $name ya slurry")
    } yield ()

}
