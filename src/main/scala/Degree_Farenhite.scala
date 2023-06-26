object Degree_Farenhite {

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    println("Enter temperature in degree:")
    val temp = StdIn.readInt()
    val far = (temp*9/5)+32
    print("Temperature in Farenhite is", far)
  }

}
