package tutoString

/**
 * @author sebastian.garces
 */
class TutoString {

  var frase = "Whut my nigga"
  var cantidadLetras = frase.length()

  def letras(): Unit = {
    println(cantidadLetras)
  }

  var edad = 24
  var nombre = "Sebastian"

  var consulta = printf("Su nombre es %s" + " y su edad es %d", nombre, edad)

}

object funcion {

  def main(args: Array[String]) {
    var df = new TutoString()
    df.consulta
  }
}