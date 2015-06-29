
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
object chatpage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

<body>

<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<table>
<td><div id="onChat" class="row">
        <div class="span10" id="main">
            <div id="messages">
            </div>
            <textarea id="talk"></textarea>
            <button id="clk">click here</button>
        </div>
        </div>
        <div class="span4">
            <h2>Members</h2>
            <ul id="members">
            </ul>
	
        </div>
    </td>
       <td> <form action="/logout" method="post">
			
			
			<input type="submit" value="Logout" style="background-color: red">
		</form></td>
		</table>
        
 
 <script type="text/javascript" charset="utf-8">
 
        
            var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket;
	        var chatSocket = new WS(""""),_display_(/*37.36*/routes/*37.42*/.Application.chat2().webSocketURL(request)),format.raw/*37.84*/("""");
	        var WS2 = window['MozWebSocket'] ? MozWebSocket : WebSocket;
	        var chatSocket2 = new WS2(""""),_display_(/*39.38*/routes/*39.44*/.Application.list2().webSocketURL(request)),format.raw/*39.86*/("""");
	        var name = document.cookie.split('=');
            var sendMessage = function() """),format.raw/*41.42*/("""{"""),format.raw/*41.43*/("""
                  """),format.raw/*42.19*/("""var mess = $("#talk").val();
                  name[1].concat(" : ");
                  name[1].concat(mess);
                  console.log(name[1]);
                  console.log(mess);
                  console.log(name);
                  chatSocket.send(JSON.stringify(
                        """),format.raw/*49.25*/("""{"""),format.raw/*49.26*/("""
                         """),format.raw/*50.26*/("""name2: name[1] 
                        """),format.raw/*51.25*/("""}"""),format.raw/*51.26*/("""
                        """),format.raw/*52.25*/("""))
                  $("#talk").val('')
                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/(""";
            
            var receiveEvent = function(event) """),format.raw/*56.48*/("""{"""),format.raw/*56.49*/("""
                """),format.raw/*57.17*/("""var data =  JSON.parse(event.data);
                
                // Create the message element
                var el = $('<div class="message"><span></span><p></p></div>')
                $("p", el).text(data.message)
                $('#messages').append(el)
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/(""";
            
            var datamembers = function(data1)"""),format.raw/*65.46*/("""{"""),format.raw/*65.47*/("""
                         """),format.raw/*66.26*/("""var data2 =  JSON.parse(data1.data);
                        console.log(data1)
                         var el = $('<div><button id="mmb" onclick="checkmmb()"></button></div>')
                        $("button", el).text(data2)
                        $('#members').append(el)
               """),format.raw/*71.16*/("""}"""),format.raw/*71.17*/(""";
           
            
            $("#clk").click(sendMessage)  
            
           
            chatSocket.onmessage = receiveEvent
            chatSocket2.onmessage = datamembers
            function checkmmb()"""),format.raw/*79.32*/("""{"""),format.raw/*79.33*/("""
                        """),format.raw/*80.25*/("""console.log("in check")
                        chatSocket.send(JSON.stringify(
                        """),format.raw/*82.25*/("""{"""),format.raw/*82.26*/("""text : $("#mmb").val()"""),format.raw/*82.48*/("""}"""),format.raw/*82.49*/("""
                        """),format.raw/*83.25*/("""))
                        """),format.raw/*84.25*/("""}"""),format.raw/*84.26*/("""
        
   
    """),format.raw/*87.5*/("""</script>    
</body>
</html>














"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 23 12:50:32 IST 2015
                  SOURCE: /Users/Rishi/Downloads/activator-1.3.4-minimal/chat/app/views/chatpage.scala.html
                  HASH: 7cd2b5d59adaa0ef317d9f31a215d7e10964857c
                  MATRIX: 801->1|1762->935|1777->941|1840->983|1978->1094|1993->1100|2056->1142|2177->1235|2206->1236|2253->1255|2579->1553|2608->1554|2662->1580|2730->1620|2759->1621|2812->1646|2896->1702|2925->1703|3015->1765|3044->1766|3089->1783|3394->2060|3423->2061|3511->2121|3540->2122|3594->2148|3916->2442|3945->2443|4195->2665|4224->2666|4277->2691|4409->2795|4438->2796|4488->2818|4517->2819|4570->2844|4625->2871|4654->2872|4699->2890
                  LINES: 29->2|64->37|64->37|64->37|66->39|66->39|66->39|68->41|68->41|69->42|76->49|76->49|77->50|78->51|78->51|79->52|81->54|81->54|83->56|83->56|84->57|90->63|90->63|92->65|92->65|93->66|98->71|98->71|106->79|106->79|107->80|109->82|109->82|109->82|109->82|110->83|111->84|111->84|114->87
                  -- GENERATED --
              */
          