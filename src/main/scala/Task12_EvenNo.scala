object Task12_EvenNo {

  def main(args: Array[String]): Unit = {

    var count = 0
    for (i <- 50 to 100) {
      if (i % 2 == 0) {
        count = count + 1
      }
    }
    println(count)
  }

  }
