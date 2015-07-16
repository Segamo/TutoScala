package codeforce2

/**
 * @author sebastian.garces
 */
object Banana {
  def main(args: Array[String]): Unit = {

    var valor = 0
    var temp = new Array[Int](2)
    var line = readLine()
    temp = line.split(" ") map (_.toInt)

    var k = temp(0)
    var n = temp(1)
    var w = temp(2)

    for (a <- 1 to w) valor += a * k

    if(valor-n<0){
      println(0)
    }else
    println(valor - n)
  }
}