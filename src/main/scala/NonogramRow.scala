object NonogramRow extends App {

  def countOneConsecutive(ar: Array[Int]): Array[Int] = {
    if (ar.head == 0)
ar.mkString.split("0+").tail.map(_.length)
    else ar.mkString.split("0+").map(_.length)
  }
}
