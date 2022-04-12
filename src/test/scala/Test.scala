import route.RouteTree
import route.inter.{Complete, Context}

import concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Test {
  def main(args: Array[String]): Unit = {

    RouteTree.buildRoute("/:api/:name/ccc/:order", "m", (c: Context) => Complete())
    val r = RouteTree.matchRoute("/api/Pigeon/ccc/ls", "m")
    println(r._1.get)
  }
}
