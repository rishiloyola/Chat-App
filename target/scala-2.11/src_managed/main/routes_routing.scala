// @SOURCE:/Users/Rishi/Downloads/activator-1.3.4-minimal/chat/conf/routes
// @HASH:21aad17368c28bc591986a204f4dca18855aaedb
// @DATE:Sat Jun 20 11:18:48 IST 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_welcome0_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
private[this] lazy val controllers_Application_welcome0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).welcome(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "welcome", Nil,"POST", """ Home page""", Routes.prefix + """signin"""))
        

// @LINE:7
private[this] lazy val controllers_Application_login1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:8
private[this] lazy val controllers_Application_index2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_chat23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("open"))))
private[this] lazy val controllers_Application_chat23_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).chat2(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "chat2", Nil,"GET", """""", Routes.prefix + """open"""))
        

// @LINE:10
private[this] lazy val controllers_Application_logout4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout4_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"POST", """""", Routes.prefix + """logout"""))
        

// @LINE:11
private[this] lazy val controllers_Application_list25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("list2"))))
private[this] lazy val controllers_Application_list25_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).list2(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "list2", Nil,"GET", """""", Routes.prefix + """list2"""))
        

// @LINE:13
private[this] lazy val controllers_Assets_versioned6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""@controllers.Application@.welcome()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""@controllers.Application@.login()"""),("""GET""", prefix,"""@controllers.Application@.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """open""","""@controllers.Application@.chat2()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""@controllers.Application@.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """list2""","""@controllers.Application@.list2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.versioned(path:String = "/public", file:Asset)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_welcome0_route(params) => {
   call { 
        controllers_Application_welcome0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).welcome())
   }
}
        

// @LINE:7
case controllers_Application_login1_route(params) => {
   call { 
        controllers_Application_login1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).login())
   }
}
        

// @LINE:8
case controllers_Application_index2_route(params) => {
   call { 
        controllers_Application_index2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index())
   }
}
        

// @LINE:9
case controllers_Application_chat23_route(params) => {
   call { 
        controllers_Application_chat23_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).chat2())
   }
}
        

// @LINE:10
case controllers_Application_logout4_route(params) => {
   call { 
        controllers_Application_logout4_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).logout())
   }
}
        

// @LINE:11
case controllers_Application_list25_route(params) => {
   call { 
        controllers_Application_list25_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).list2())
   }
}
        

// @LINE:13
case controllers_Assets_versioned6_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(controllers.Assets.versioned(path, file))
   }
}
        
}

}
     