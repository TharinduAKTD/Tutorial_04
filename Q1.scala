import scala.io.StdIn

object InterestCalculator {

  def main(args: Array[String]): Unit = {
    println("Enter amount :")
    val n=scala.io.StdIn.readFloat()

    
    if (n<=20000)
      val total=n*2/100 + n
      println(total)
    else if (n<=200000)
      val total=n*4/100 + n
      println(total)
    else if (n<=2000000)
      val total=n*3.5/100 + n      
      println(total)
    else
      val total=n*6.5/100 + n
      println(total)


  }
}
