object Task18_Average {

  def main(args: Array[String]): Unit = {
    var sum = 0
    var count = 0

    for (i <- 24 to 100) {
      if (i % 2 == 0) {
        sum = sum+i
        count = count+1
      }
    }
    println(sum/count)
  }
}
