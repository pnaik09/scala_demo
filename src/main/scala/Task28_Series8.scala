object Task28_Series8 {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to 25) {
      if (i % 5 == 0) {
        println("Divisible by 5")
      }
      else  if (i % 2 == 1) {
        println(i)
      }
    }
  }


}
