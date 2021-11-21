trait Divisible[T] {
  def div(x: T, y: T): T
}

object Divisible {
  implicit def divisibleFromIntegral[T](implicit T: Integral[T]): Divisible[T] = (x: T, y: T) => T.quot(x, y)

  implicit def divisibleFromFractional[T](implicit T: Fractional[T]): Divisible[T] = (x: T, y: T) => T.div(x, y)
}
