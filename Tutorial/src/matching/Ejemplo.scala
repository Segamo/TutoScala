package matching

import scala.util.matching.Regex

object Ejemplo {
  def main(args: Array[String]) {
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"

    println(pattern replaceAllIn (str, "Java"))

  }
}