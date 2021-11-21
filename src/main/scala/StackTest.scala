object StackTest extends App {

  val avg1 = Stack.empty[Int].push(1).push(2).average

  println("Stack1 avg = " + avg1)

  val avg2 = Stack.empty[Double].push(1).push(2).push(2).average

  println("Stack2 avg = " + avg2)

  val avg3 = Stack.empty[Float].push(1).push(2).push(2).average

  println("Stack3 avg = " + avg3)

  val stack4 = Stack.empty[String].push("alpha").push("gamma").push("delta")

  println("stack4 = " + stack4)

  //Stack.empty[String].push("alpha").push("gamma").push("delta").average
}
