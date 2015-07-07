package acceso

/**
 * @author sebastian.garces
 */

class Definicion() {

  
  def f(a: Int) {

    println(a+1)

  }

}

object Acceso {

  def main(args: Array[String]) {
    var df = new Definicion();

    println(df.f(2))
  }
}