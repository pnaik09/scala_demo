object PrimeNo {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    println("Enter the number ")
    val num = StdIn.readInt()
    var count = 0

    for (i <- 1 to num){
      if (num%i == 0){
        count = count + 1

      }
    }
    if (count == 2){
      print("Yes, Prime number", num)
    }
    else {
      print("Its not Prime number")
    }
  }

}
