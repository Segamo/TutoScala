package loop

/**
 * @author sebastian.garces
 */
class Loop {

  def whileLoop {

    var a = 0

    while (a < 10) {

      println("Holi")
      a += 1
    }

  }

  def doWhile {

    var a = 0

    do {

      println("Si?")
      a += 1
    } while (a < 2)

  }

  def forLoop {

    for (a <- 1 to 10) {
      println("holi" + " " + a)
    }

    println("=========================")

    for (a <- 1 until 10) {
      println("holi" + " " + a)
    }

    println("=========================")

    for (a <- 1 to 3; b <- 1 to 4) {

      println(a)
      println(b)

    }

    println("=========================")

    var lista = List(1, 2, 3, 4, 3)

    for (a <- lista) {

      println(a)

    }

    println("=========================")

    for (
      a <- 1 to 5 if a != 2
    ) {

      println(a)

    }

  }

}

object funcion {

  def main(args: Array[String]) {
    var df = new Loop();
    println(df.forLoop)
  }
}