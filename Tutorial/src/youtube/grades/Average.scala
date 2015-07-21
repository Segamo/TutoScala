package youtube.grades

import scala.io.StdIn.{readDouble, readInt}

object Average {
  def main(args: Array[String]) {
    println("How many grades do you have?")
    val numGrade = readInt()
    var sum: Double = 0
    var average: Double = 0

    for (i <- 1 to numGrade) {
      println("Insert the " + i + " grade")
      sum += readDouble()
    }
    if (numGrade > 0) {
      average = sum / numGrade
      println("Your average is: " + average)
    } else println("Can't have an average")
  }
}