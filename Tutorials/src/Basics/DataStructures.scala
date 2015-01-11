package Basics

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
   def map()={
     Map(tuple)
   }
   
   
}
object dataStruct{
  
  def apply()={
    new DataStructures()
  }
}