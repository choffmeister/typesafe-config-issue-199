package de.choffmeister

import com.typesafe.config._

object Application extends App {
  val conf = ConfigFactory.load()
  val fst = conf.getString("my.fst")
  val snd = conf.getString("my.snd")

  println(s"fst = $fst")
  println(s"snd = $snd")
}
