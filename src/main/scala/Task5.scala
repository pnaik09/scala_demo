object Task5 {
  def main(args: Array[String]): Unit = {

    val a: Int = 125

    if (a >= 0 && a <= 100) {
      if (a >= 90 && a <= 100){
        println("Super Smart")
      }
      else if (a >= 80 && a <= 90){
        println("Smart")
      }
      else if (a >= 70 && a <= 80){
        println("Smart enough")
      }
      else if (a >= 60 && a <= 70){
        println("Smart")
      }
      else if (a >= 35 && a <= 60){
        println("No smart")
      }
      else if (a >= 0 && a <= 30){
        println("Dumb")
      }

      }
    else{
      println("Invalid Input")
    }
    }



}
