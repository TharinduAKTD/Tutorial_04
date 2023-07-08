import scala.io.StdIn

object PatternMatch{

  def main(args: Array[String]): Unit = {
    print("Enter a Number :")
    val n=scala.io.StdIn.readInt()

    val t=n%2

    if (n<=0)
      println("Negative/ Zero")
    else if (t==0)
      println("Even Number")
    else
      println("Odd Number")
  }


}