import route.RouteTree

object Test {
  def main(args: Array[String]): Unit = {
    RouteTree.buildRoute("/api/:name/ls", "m", (x: Int) => x * 7)
    val r = RouteTree.matchRoute("/api/Pigeon/ls", "m")
    println(r.get._2)
  }
}
