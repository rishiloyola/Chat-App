
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Rishi/Downloads/activator-1.3.4-minimal/chat/conf/routes
// @DATE:Tue Jun 16 20:01:31 IST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
