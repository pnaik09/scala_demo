object Task27_Series7 {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to 24) {
      if (i % 3 == 0) {
        println("Factor of 3")
      }
      else {
        println(i)
      }
    }
  }

}
