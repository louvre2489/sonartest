package example

object Hello extends Greeting with App {
  println(greeting)

  def noImpl: Unit = {}
}

trait Greeting {
  lazy val greeting: String = "hello"
}
