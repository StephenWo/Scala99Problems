object Q4NumberOfElements {
  def main(args: Array[String]): Unit ={
    val ls = List(1,1,2,3,5,8)
    println(length2(ls))
  }

  def length[A](ls: List[A]): Int = ls match {
    case Nil       => 0
    case _ :: tail => 1 + length(tail)
  }

  def length2[A](ls: List[A]): Int = ls.foldLeft(0){ (a, _) => a + 1}
}
