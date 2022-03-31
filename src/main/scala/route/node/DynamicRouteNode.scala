package route.node

import route.node.RouteNode

import scala.collection.mutable

final case class DynamicRouteNode(
                               paramName: String,
                               override val matchedPath: String,
                               override val children: mutable.HashMap[String, RouteNode] = mutable.HashMap.empty,
                               override val handlers: mutable.HashMap[String, Int=>Int] = mutable.HashMap.empty
                           ) extends RouteNode
