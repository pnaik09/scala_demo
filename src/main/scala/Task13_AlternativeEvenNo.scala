object Task13_AlternativeEvenNo {

  def main(args: Array[String]): Unit = {
    for (i <- 20 to 140 by 4) {
      if (i % 2 == 0) {
        println(i)
      }
      else {
        println(i+1)
      }
      }
    }


  }
