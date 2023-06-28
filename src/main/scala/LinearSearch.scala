object LinearSearch {

  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    println("Enter the length of the array:")
    val size = StdIn.readInt()

    val arr = new Array[Int](size)

    for (index <- 0 until size) {
      println(s"Enter element $index:")
      arr(index) = StdIn.readInt()
    }

    print("Enter the key element ")
    val key = StdIn.readInt()

    for( i <- 0 until size){
      if (arr(i) == key){
        print("Given element is in index ",i)
      }

    }
  }



}