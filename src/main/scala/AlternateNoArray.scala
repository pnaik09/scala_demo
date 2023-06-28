object AlternateNoArray {

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    print("Enter the size of array ")
    val size = StdIn.readInt()

    val arr = new Array[Int](size)

    for(index <- 0 until size){
      println(s"Enter element $index ")
      arr(index) = StdIn.readInt()
    }

    for (i <- 0 until size){
      if(i%2 == 0){
        println(arr(i))
      }
    }
  }
}
