object Q8ElimateDup {
  def main(args: Array[String]): Unit ={
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

    println(compress(ls).mkString(","))
  }
  def compress[A](ls: List[A]): List[A] = ls match {
    case h :: tail => h :: compress(tail.dropWhile(_ == h))
    case Nil => Nil
  }

  def compressFunctional[A](ls: List[A]): List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
}
