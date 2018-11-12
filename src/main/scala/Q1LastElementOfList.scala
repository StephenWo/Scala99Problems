object Q1LastElementOfList {
     def main(args: Array[String]): Unit ={
       val nums = List(1,1,2,3,5,8)
       println(last(nums))
     }
     def last(nums: List[Int]): Int = {
       nums.last
     }
}



