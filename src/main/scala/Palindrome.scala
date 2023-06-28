object Palindrome {

  def main(args: Array[String]): Unit = {

    import scala.io.StdIn

    print("Enter num ")
    val num = StdIn.readInt()
    var rev = 0
    var temp = num
    while (temp>0){
      val dig = temp%10
      rev = rev*10 + dig
      temp = temp /10
    }
    if (num == rev){
      println("Palindrome")
//      print("rev", rev)
//      print("Num", num)
    }
    else {
      print("Not Palindrome")
//      print("rev", rev)
//      print("Num", num)
    }
  }

}
