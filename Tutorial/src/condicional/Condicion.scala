package operadores

/**
 * @author sebastian.garces
 */
class Condicion {

  def condicion() {

    var c = 2
    var q = 0

    if (c < 1) {

      q = 3

      println(q)

    } else {
      println("Wut?")
    }

  }

}

object funcion {

  def main(args: Array[String]) {
    var df = new Condicion();
    println(df.condicion())
  }
}