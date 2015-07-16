package codeforce

import scala.io._
import Array._
import collection.immutable.SortedMap

object lala {
  def main(args: Array[String]) {

    implicit val Ord = implicitly[Ordering[Int]]
    
    var totalApples = 0
    val numberOfTrees = readInt()
    var field: Map[Int, Int] = Map()
    var fieldPositive: SortedMap[Int, Int] = SortedMap()
    var fieldPositive1: SortedMap[Int, Int] = SortedMap()
    var fieldPositive2: SortedMap[Int, Int] = SortedMap()
    var fieldNegative: SortedMap[Int, Int] = SortedMap()(Ord.reverse)
    var fieldNegative1: SortedMap[Int, Int] = SortedMap()(Ord.reverse)
    var fieldNegative2: SortedMap[Int, Int] = SortedMap()(Ord.reverse)
    
    for (a <- 0 until numberOfTrees) {
      var temp = new Array[Int](2)
      var line = readLine()
      temp = line.split(" ") map (_.toInt)
      for (b <- 0 until 2) {
        field += (temp(0) -> temp(1))
      }
    }

    for (a <- field) {
      if (a._1 < 0) {
        fieldNegative += (a._1 -> a._2)
      } else {
        fieldPositive += (a._1 -> a._2)
      }
    }

    if (fieldPositive.size == fieldNegative.size) {
      totalApples += fieldPositive.foldLeft(0)(_ + _._2)
      totalApples += fieldNegative.foldLeft(0)(_ + _._2)
    }

    if (fieldPositive.size > fieldNegative.size) {
      totalApples += fieldNegative.foldLeft(0)(_ + _._2)
      fieldPositive1 = fieldPositive.take(fieldNegative.size)
      totalApples += fieldPositive1.foldLeft(0)(_ + _._2)
      fieldPositive2 = fieldPositive.take(fieldNegative.size + 1)
      totalApples += fieldPositive2.last._2
    }

    if (fieldPositive.size < fieldNegative.size) {
      totalApples += fieldPositive.foldLeft(0)(_ + _._2)
      fieldNegative1 = fieldNegative.take(fieldPositive.size)
      totalApples += fieldNegative1.foldLeft(0)(_ + _._2)
      fieldNegative2 = fieldNegative.take(fieldPositive.size + 1)
      totalApples += fieldNegative2.last._2
    }
    println(totalApples)
  }
}