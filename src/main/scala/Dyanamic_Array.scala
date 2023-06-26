object Dyanamic_Array {

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    // Ask the user for the length of the array
    println("Enter the length of the array:")
    val size= StdIn.readInt()
    println("this is size value:", size);

    //Define an empty array with the specified length 0 untill n-----0,1 ,2 3,4.9
    val arr = new Array[Int](size) //10\\\

    // Read values from the user and insert them into the array
    for (i <- 0 until  size) {
      println(s"Enter element $i:")
      arr(i) = StdIn.readInt()
    }

    //Print the contents of the array
    println("Array contents:")
    for (i <- 0 until size) {
      println(arr(i))
    }
  }
}