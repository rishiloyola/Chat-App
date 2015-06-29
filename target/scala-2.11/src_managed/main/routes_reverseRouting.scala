// @SOURCE:/Users/Rishi/Downloads/activator-1.3.4-minimal/chat/conf/routes
// @HASH:21aad17368c28bc591986a204f4dca18855aaedb
// @DATE:Sat Jun 20 11:18:48 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {


// @LINE:13
def versioned(file:Asset): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
}
                        

}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def chat2(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "open")
}
                        

// @LINE:11
def list2(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "list2")
}
                        

// @LINE:10
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:6
def welcome(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signin")
}
                        

// @LINE:8
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:7
def login(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:13
class ReverseAssets {


// @LINE:13
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def chat2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.chat2",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "open"})
      }
   """
)
                        

// @LINE:11
def list2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list2",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list2"})
      }
   """
)
                        

// @LINE:10
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def welcome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.welcome",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {


// @LINE:13
def versioned(path:String, file:Asset): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def chat2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).chat2(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "chat2", Seq(), "GET", """""", _prefix + """open""")
)
                      

// @LINE:11
def list2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).list2(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "list2", Seq(), "GET", """""", _prefix + """list2""")
)
                      

// @LINE:10
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "POST", """""", _prefix + """logout""")
)
                      

// @LINE:6
def welcome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).welcome(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "welcome", Seq(), "POST", """ Home page""", _prefix + """signin""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      

}
                          
}
        
    