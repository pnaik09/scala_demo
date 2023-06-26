object Task19_SumSeries {

  def main(args: Array[String]): Unit = {
    var square = 0
    var series = 0
    var sum = 0

    for (i <- 5 to 100) {
      square = i*i
      series = i + 1
      sum = sum + square

    }
    println(sum)
  }


}
