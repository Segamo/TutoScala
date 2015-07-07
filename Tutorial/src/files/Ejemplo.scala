package files

import java.io._

object Ejemplo {
  def main(args: Array[String]) {

    print("Please enter your input : ")
    var line = readLine()

    println("Thanks, you just typed: " + line)

    val writer = new PrintWriter(new File("C:/Users/sebastian.garces/Downloads/est.txt"))

    writer.write(line)
    writer.close()

  }

}