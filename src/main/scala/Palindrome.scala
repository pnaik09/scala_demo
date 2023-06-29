object Palindrome {

  def main(args: Array[String]): Unit = {

    import scala.io.StdIn

    print("Enter num ")
    val num = StdIn.readInt()
    var rev = 0
    var temp = num  //taking temp as reference
    while (temp>0){
      val dig = temp%10 //To get the last digit for each loop
      rev = rev*10 + dig  //storing in rev - multiply by 10 to shift places of number - eg: from Unit to ten - ten to hundred so on
      temp = temp /10 //eliminating last digit too get ready for next loop
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
