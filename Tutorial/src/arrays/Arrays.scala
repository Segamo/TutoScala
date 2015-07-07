package arrays

import Array._
/**
 * @author sebastian.garces
 */
class Arrays {

  var insertar = 546546
  var cedula = new Array[BigInt](2)
  for (i <- 0 to (cedula.length - 1)) {

    cedula(i) = insertar
    insertar *= 5
  }

  for (i <- cedula) {
    println(i)
  }

  var myMatrix = ofDim[Int](3, 3)

  for (i <- 0 until 3; j <- 0 until 3) {
    myMatrix(i)(j) = i * j
  }

  for (i <- 0 until 3; j <- 0 until 3) {
     
    print(" " + myMatrix(i)(j))
    if(j == 2){
      println()
    }
  }
  

}

object funcion {

  def main(args: Array[String]) {
    var df = new Arrays()
    println()
  }
}