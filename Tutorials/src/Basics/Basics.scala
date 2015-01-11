

package Basics/**
 * @author Ter
 */

class HelloWorld
{
  val className = "Scala Basics"
  def addOne(m:Int): Int  = 
  {
      m+1
  }
  
  def multiply(m:Int,n:Int) = 
  {
    m*n
  }
  
  def captializeAll(args: String*)=
  {
    args.map{ arg => 
      arg.capitalize
    }
  }
  def stringContains( n:String, m:String)=
  {
     n.contains(m)
  }
  
  def increaseSize(o:Any)={
    o match {
      case i:Int if i< 0 => -1
      case i : Int => i+1
      case d:Double if d < 0.0 => d- 0.1
      case d:Double => d + 0.1
      case _ => "Not a number"
    }
  }
  
}

case class Computer(cpu:String, mem:String)

object HelloWorld{
  def apply()={
    new HelloWorld();
  }
}



