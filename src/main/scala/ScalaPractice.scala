object ScalaPractice {

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    println("Enter KG")
    val KG = StdIn.readInt()
    val grams = KG * 1000
    println("the value in gram is :", grams)

  }
}