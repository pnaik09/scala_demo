object Task23_Series3 {

  def main(args: Array[String]): Unit = {

    val start = 5
    val end = 25
    val step = 2

    var i = start

    while (i <= end) {
      val result = i * i

      print(s"$result, ")
      i += step
    }

    }


}
