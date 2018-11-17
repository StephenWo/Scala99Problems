import java.util.NoSuchElementException

object Q1LastElementOfList {
     def main(args: Array[String]): Unit ={
       val nums = List(1,1,2,3,5,8)
       println(last(nums))
     }
    /*This is using built in functions
     def last(nums: List[Int]): Int = {
       nums.last
     }
     */
    def last[A](nums: List[A]): A = nums match {
      case _ => throw new NoSuchElementException
      case h :: Nil => h
      case _ :: tail => last(tail)
    }

}



