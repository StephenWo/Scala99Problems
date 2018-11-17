object Q3NthRecursive {
  def main(args: Array[String]): Unit ={
    val ls = List(1,1,2,3,5,8)
    println(nthElement(2, ls))
  }

  def nthElement[A](n:Int, ls: List[A]): A= (n, ls) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nthElement(n-1, tail)
    case (_, Nil) => throw new NoSuchFieldException
  }
}
