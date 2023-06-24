object ScalaPractice {

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    println("Enter KG")
    val size = StdIn.readInt()
    val grams = size * 1000
    println("the value in gram is :", grams);

  }
}