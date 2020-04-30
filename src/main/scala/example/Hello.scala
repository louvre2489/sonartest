package example

object Hello extends Greeting with App {
  println(greeting)

  def noImpl: Unit = {}
  def noImpl2: Unit = {}
}

trait Greeting {
  lazy val greeting: String = "hello"
}
