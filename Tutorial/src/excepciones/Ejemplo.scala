package excepciones

object Ejemplo {
  def main(args: Array[String]) {

    def div(a: Int, b: Int): String = {
      try {
        var result = a / b
        println(result)
        "Exito"
      } catch {
        case ex: ArithmeticException => {
          "Fallo"
        }
      }
    }
    println(div(5, 0))
  }
}