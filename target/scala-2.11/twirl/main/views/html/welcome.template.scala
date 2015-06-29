
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
<body>
<form action="/signin" method="post" class="pull-right">
 <input id="username" name="username" class="input-small" type="text" placeholder="Username">
 <input id="password" name="password" class="input-small" type="password" placeholder="Password">

    <button class="btn" type="submit">Sign in</button>
 </form>

<form action="/login" method="post" class="pull-right">
 <input id="loginname" name="loginname" class="input-small" type="text" placeholder="Username">
 <input id="loginpassword" name="loginpassword" class="input-small" type="password" placeholder="Password">

    <button class="btn" type="submit">Login in</button>
 </form>
 
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 11:33:13 IST 2015
                  SOURCE: /Users/Rishi/Downloads/activator-1.3.4-minimal/chat/app/views/welcome.scala.html
                  HASH: 022eec76d57cee19f3b5fa25b44332f138a362b2
                  MATRIX: 800->0
                  LINES: 29->1
                  -- GENERATED --
              */
          