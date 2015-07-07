package switchs.cases

/**
 * @author sebastian.garces
 */
trait Ejemplo {
  var mul = (x: Int, y: Int) => x * y
  var sum = (x: Int, y: Int) => x + y
  var div = (x: Int, y: Int) => x / y
  var rest = (x: Int, y: Int) => x - y
}

object Test extends Ejemplo {
  def main(args: Array[String]) {
    def matchTest(x: String, a: Int, b: Int): Int = x match {
      case "mul"  => mul(a, b)
      case "sum"  => sum(a, b)
      case "div"  => div(a, b)
      case "rest" => rest(a, b)
    }
    println(matchTest("rest", 3, 3))

  }
}