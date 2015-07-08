package tupla

/**
 * @author sebastian.garces
 */
object Tupla {
  def main(args: Array[String]) {
    val tuplita = ("holi",1, 2, "Aguacate", 2.3)

    tuplita.productIterator.foreach { i => println("Tuplita posee: " + i) }
    
  }
}