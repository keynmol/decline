package com.monovore.decline

import java.nio.file.{InvalidPathException, Path, Paths}

import cats.data.{Validated, ValidatedNel}
import scala.util.control.NonFatal

private[decline] abstract class PlatformArguments {

  // implicit val readPath: Argument[Path] = new Argument[Path] {

  //   override def read(string: String): ValidatedNel[String, Path] = 
  //     // try {
  //       Validated.valid(Paths.get(string))

  //     // } catch {
  //     //   case NonFatal(ipe) =>
  //     //     Validated.invalidNel(s"Invalid path: $string (${ipe.getMessage})")
  //     // }

  //   override def defaultMetavar: String = "path"
  // }
}
