package coursera.week1

import scala.annotation.tailrec

object session {

  // This is an example from Coursera

  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.00000001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }
  sqrt(2)

	@tailrec
  def division(a: Int): Int ={
  	if (a == 0) a else division(a/2)
  }
 	division(64554654)
}