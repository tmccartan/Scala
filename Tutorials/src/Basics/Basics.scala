

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
}

