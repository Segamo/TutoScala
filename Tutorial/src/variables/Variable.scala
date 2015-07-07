package variables

/**
 * @author sebastian.garces
 */
object Variable {
  def main(args: Array[String]) {
    println("¡Hola, mundo!")

    var a = 0
    
    increaseTwo(a)
    
    println(a)
    
    val x = 0 // Variable estatica
    
    var (myVar1: Int, myVar2: String, myVar3: Int) = (40, "Foo", 50) // declaraciond de multiples variables
    
    println(myVar1)

  }
  
  def increaseTwo(i: Int) = i + 2
}