package example

object Hello extends Greeting with App {
  println(greeting)

  def noImpl: Int = {
    val a = (14 / 1).toInt
  }
  def noImpl2: Unit = {}
  def noImpl3: Unit = {}
}

trait Greeting {
  lazy val greeting: String = "hello"
}
