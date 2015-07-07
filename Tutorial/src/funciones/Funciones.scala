package funciones

/**
 * @author sebastian.garces
 */
class Funciones {

  def suma(a: Int, b: Int): Int = {
    a + b
  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed(t: => Long) = {
    println("In delayed method")
    println("Param: " + t)
    t
  }

  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  var mul = (x: Int, y: Int) => x * y

  def multiplicacion(x: Int, y: Int) {
    println(mul(x, y))
  }

  def strcat(s1: String)(s2: String) = {
      s1 + s2
   }
  
}

object funcion {

  def main(args: Array[String]) {
    var df = new Funciones()
    println(df.strcat("23")("23"))
  }
}