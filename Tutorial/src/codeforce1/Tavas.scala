package codeforce1

/**
 * @author sebastian.garces
 */
object Tavas {
  def main(args: Array[String]): Unit = {

    val score = readInt()

    var oneToTen = Array("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    var tens = Array(" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
    var special = Array("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
    var a = score / 10
    var b = score % 10

    if (score == 0) {
      println(oneToTen(0))
    } else {
      if (score > 9 && score < 20) {
        println(special(b))
      } else {
        if (a == 0) {
          println(oneToTen(b))
        } else {
          if (b == 0) {
            println(tens(a))
          } else println(tens(a) + "-" + oneToTen(b))
        }
      }
    }
  }
}