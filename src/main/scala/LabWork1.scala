import scala.io.StdIn.readLine

object LabWork1 extends App{
  println(readLine().split(" ").maxBy(_.length))
}

