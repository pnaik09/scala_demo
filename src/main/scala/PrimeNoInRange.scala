object PrimeNoInRange {
  def main(args: Array[String]): Unit = {

    import scala.io.StdIn

    print("Enter first num ")
    val x = StdIn.readInt()
    print("Enter second num ")
    val y = StdIn.readInt()
    val rng = x to y

    for (individualNo <- rng) {
      val num = individualNo
      var count = 0

      for (i <- 1 to num) {
        if (num % i == 0) {
          count = count + 1

        }
      }
      if (count == 2) {
        println("Prime number", num)
      }

    }


    }
}
