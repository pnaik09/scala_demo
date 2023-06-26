object Math_Match {

  def main(args:  Array[String]): Unit = {
    import scala.io.StdIn

    println("Enter first number")
    val firstNum: Int = StdIn.readInt()
    println("Enter Second Number")
    val secondNum: Int = StdIn.readInt()
    println("Enter operator")
    val opp: Char = StdIn.readChar()

    opp match {
      case '+' => println("Addition: ", firstNum+secondNum)
      case '-' => println("Subtraction: ", firstNum-secondNum)
      case '*' => println("Multiplication: ", firstNum*secondNum)
      case '/' => println("Division: ", firstNum/secondNum)
    }
  }

}
