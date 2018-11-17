import java.util.NoSuchElementException

object Q2Penultimate {
    def main(args: Array[String]): Unit ={
      val ls = List(1,1,2,3,5,8)
      println(penultimate(ls))
    }
    /*
    def penultimate[A](ls: List[A]): A= {
      if (ls.isEmpty) throw new NoSuchElementException
      else ls.init.last
    }
    */

    def penultimate[A](ls: List[A]): A = ls match {
      case h :: _  :: Nil => h
      case _ :: tail      => penultimate(tail)
      case _              => throw new NoSuchElementException
    }

}
