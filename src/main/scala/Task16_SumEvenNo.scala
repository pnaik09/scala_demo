object Task16_SumEvenNo {
  def main(args: Array[String]): Unit = {
    var summ = 0
    for (i <- 382 to 582) {
      if (i%2 == 0){
        summ = summ + i
      }

    }
    println(summ)


  }

}
