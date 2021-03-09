package example

import zio.ZIO

object FromScalaValues {
    val zOption: zio.IO[Option[Nothing],Int] = ZIO.fromOption(Some(5))
    val zOptionNone: zio.IO[Option[Nothing],Int] = ZIO.fromOption(None)

}