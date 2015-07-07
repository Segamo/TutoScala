package traits

/**
 * @author sebastian.garces
 */
trait Traits {
  
  def multi(a: Int, b:Int): Int ={
    a*b
  }
  
}


trait Traits1 {
  
  def sum(a: Int, b:Int): Int ={
    a+b
  }
  
}

object Test extends Traits with Traits1{
   def main(args: Array[String]) {
      println(multi(2, 2))
      println(sum(2, 3))
   }
}