object Q9Pack {
  def main(args: Array[String]): Unit = {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(pack(ls).flatten.mkString(","))
  }

  def pack[A](ls : List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls.span(_ == ls.head)
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  //Q10

  def encode[A](ls: List[A]): List[(Int, A)] = pack(ls).map{ x => (x.length, x.head) }
}
