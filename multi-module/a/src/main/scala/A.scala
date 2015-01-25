case class A(a: String)

case class D() {
  def bob(): Unit = {
    println("os")
  }
}

object D {
  def apply(x: Int) = new D()
}
