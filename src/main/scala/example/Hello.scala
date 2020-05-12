package example

object Hello extends Greeting with App {
  println(greeting)

  def noImpl: Unit = {
    val a = (14 / 1).toInt

    a != null
  }
  def noImpl2: Unit = {}
  def noImpl3: Unit = {}
  def noImpl4(): Unit = {}
  def noImpl5(): Unit = {}
  def noImpl6(): Unit = {}
}

trait Greeting {
  lazy val greeting: String = "hello"

  def sample() = {
    try {
      new NullPointerException()
    } catch {
      case _: NullPointerException => _
      case e => println(e)
    }
  }
}
