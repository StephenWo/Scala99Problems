object Q7flattenAny {
    def main(args: Array[String]): Unit ={
      val ls = List(List(1, 1), 2, List(3, List(5, 8)))
      println(flattenA(ls).mkString(","))
    }

    def flattenA(ls : List[Any]) : List[Any] = ls flatMap {
      case ms: List[_] => flattenA(ms)
      case b => List(b)
    }
}


