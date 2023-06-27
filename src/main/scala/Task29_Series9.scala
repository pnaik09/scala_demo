object Task29_Series9 {
  def main(args: Array[String]): Unit = {

    val start = 0.5
    val end = 5.1
    val step = 0.2

    var i = start

    while(i<= end) {
      val result = i*i

      print(f"$result%.2f, ")
      i += step
      }


  }


}
