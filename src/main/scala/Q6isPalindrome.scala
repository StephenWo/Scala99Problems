object Q6isPalindrome {
  def main(args: Array[String]): Unit ={
    val ls = List(1,2,3,2,1)

    println(isPalindrome(ls))
  }

  def isPalindrome[A](ls: List[A]): Boolean = {
    ls == ls.reverse
  }

}
