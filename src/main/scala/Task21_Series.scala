object Task21_Series {

  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 5

    for (i <- a to -b by -1) {
      val c = i - 1
      println(s"$i@$c")
    }
  }

}
