class Stack[A](elems: List[A] = List.empty[A]) {

  def push(v: A): Stack[A] = new Stack[A](v +: elems)

  def pop(): Either[String, (Stack[A], A)] = {
    if (isEmpty) Left("Cannot pop from empty stack")
    else Right(new Stack[A](elems.tail), elems.head)
  }

  def isEmpty: Boolean = elems.isEmpty

  def average[B >: A : Numeric : Divisible]: B = {
    val numericList: List[B] = elems
    implicitly[Divisible[B]].div(numericList.sum, implicitly[Numeric[B]].fromInt(elems.size))
  }

  override def toString: String = elems.mkString("\n")
}

object Stack {
  def empty[A] = new Stack[A]()
}