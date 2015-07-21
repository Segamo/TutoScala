package coursera.week2

object exercise {
  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int = {
      if (n == 0) {
        acc
      } else {
        loop(acc * n, n - 1)
      }
    }
    loop(1, n)
  }                                               //> factorial: (n: Int)Int
  factorial(4)                                    //> res0: Int = 24

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)                  //> sum: (f: Int => Int, a: Int, b: Int)Int

  def sumInts(a: Int, b: Int) = sum(id, a, b)     //> sumInts: (a: Int, b: Int)Int
  def sumCubes(a: Int, b: Int) = sum(cube, a, b)  //> sumCubes: (a: Int, b: Int)Int
  def sumFactorials(a: Int, b: Int) = sum(fact, a, b)
                                                  //> sumFactorials: (a: Int, b: Int)Int

  def id(x: Int): Int = x                         //> id: (x: Int)Int
  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int
  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)
                                                  //> fact: (x: Int)Int
  1 - 0.9                                         //> res1: Double(0.09999999999999998) = 0.09999999999999998
  200000000 + 2000000000                          //> res2: Int(-2094967296) = -2094967296
}