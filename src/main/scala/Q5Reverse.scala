object Q5Reverse {
  def main(args: Array[String]): Unit ={
    val ls = List(1,2,3,4,5)
    println(rev(ls).mkString(","))
  }

  def rev[A](ls: List[A]): List[A] = ls.reverse

  def rev1[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()) { (a,b) => b :: a }

  def reverseTailRecursive[A](ls: List[A]): List[A] = {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil       => result
      case h :: tail => reverseR(h :: result, tail)
    }
    reverseR(Nil, ls)
  }


}
