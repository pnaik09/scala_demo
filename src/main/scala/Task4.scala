object Task4 {
  def main(args: Array[String]): Unit = {

   val a: Int= 100
    if (a >= 100 && a <= 1000) {
      if (a % 2 == 0) {
        val x = a % 3
        println("Even number Remainder: ",x)
      }
      else {
        val y = a % 2
        println("Odd number Remainder: ",y)
      }
    }
    else {
        println("Wrong number")
      }
    }

}
