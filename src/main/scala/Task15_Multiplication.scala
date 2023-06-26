object Task15_Multiplication {
  def main(args: Array[String]): Unit = {
    val a = 2
    val b = 17

    for (i <- a to b-1) {
      val c = i+1
      println(s"$i*$c =",i*c)
      }
    }


}
