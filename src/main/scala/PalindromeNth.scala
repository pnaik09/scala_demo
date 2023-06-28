object PalindromeNth {

  def main(args: Array[String]): Unit = {

    import scala.io.StdIn

    print("Enter first num ")
    val x = StdIn.readInt()
    print("Enter second num ")
    val y = StdIn.readInt()
    print("Enter the nth number")
    val z = StdIn.readInt()
    val rng = x to y
    var count = 0

    for (i <- rng) {
      val num = i
      var rev = 0
      var temp = num
      while (temp > 0) {
        val dig = temp % 10
        rev = rev * 10 + dig
        temp = temp / 10

      }
      if (num == rev) {
        count = count+1
        if (z == count){
          println("Palindrome", num, count)
        }

      }

    }

  }

}
