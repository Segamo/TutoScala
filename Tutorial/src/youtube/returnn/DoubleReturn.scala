package youtube.returnn

/**
 * @author sebastian.garces
 */
object DoubleReturn {

  def main(args: Array[String]): Unit = {
    val a = sumAndMessage(4, 5)
    println(a)
  }

  def sumAndMessage(x: Int, y: Int): (Int, Int, String) = {
    (x + y, 2, "Yeiii")
  }
}