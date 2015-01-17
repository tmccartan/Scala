package bsc

/**
 * @author Ter
 */
class DataStructures {
  
   def list()={
     List(1,2,3,4,5,6,7,8,9,10)
   }
   def set()={
     Set(1,1,1,2,2,2,3,4,5,6,7,8,9,10,10,2)
   }
   def tuple() ={
     ("Siberian Husky","Jake")
     //"Siberian Husky" -> "Jake"
   }
   def getMap()={
     Map(tuple)
   }
   def addOne(l:List[Int])={
     l.map { x => x+1 }
   }
   def double(l:List[Int]):List[Int]={
     l.map { x => x*2 }
     return l
   }
   def removeOdd(l:List[Int])={
     def isEven(i:Int): Boolean = i%2 == 0
     l.filter { x:Int => isEven(x) }
   }
   def combineLists(l:List[Int], k:List[Int])=
   {
     l.zip(k)
   }
   def findNumber(l:List[Int],k:Int)=
   {
     l.find((i:Int) => i == k );
   }
   def dropOddStart(l:List[Int]):List[Int]={
     return l.dropWhile(_ % 2 != 0)
   }
}
object ds{
  
  def apply()={
    new DataStructures()
  }
}