package operadores

/**
 * @author sebastian.garces
 */
class Operadores {

  def operadores() {
    var c = 2

    var a = c << 4

    println(a)
  }

}

object ain {

  def main(args: Array[String]) {
    var df = new Operadores();
    println(df.operadores())
  }
}