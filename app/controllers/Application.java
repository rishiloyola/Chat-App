package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.*;

import models.*;
import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

import java.lang.*;
import java.util.*;

import com.tinkerpop.blueprints.impls.orient.OrientBaseGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraphNoTx;
import com.tinkerpop.blueprints.impls.orient.OrientVertex;
import com.tinkerpop.blueprints.TransactionalGraph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.orientechnologies.orient.client.remote.OServerAdmin;
import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;
import com.orientechnologies.orient.core.record.impl.ODocument;
import com.orientechnologies.orient.core.storage.ORecordDuplicatedException;
import com.orientechnologies.orient.server.OServer;

import views.html.*;
import play.data.DynamicForm;
import play.data.Form;
import play.*;
import play.data.DynamicForm;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	 private static OrientGraph graph=new OrientGraph ("remote:localhost/test", "root", "rishi98245" );;
	 
    public Result index() {
        
    	return ok(welcome.render());  
    }
    public Result welcome() {
       //graph = new OrientGraph ("remote:localhost/test", "root", "rishi98245" );

    	DynamicForm requestData = Form.form().bindFromRequest();
        String inputName = requestData.get("username");
        String inputPassword = requestData.get("password");
        try{
         for (Vertex v : graph.getVertices("User.name", inputName))
              return ok("error");
        }catch(Exception e){
        	
        	
        }
        Vertex user;
    	user = graph.addVertex("class:User", "name", inputName,"password", inputPassword);

		//Expect errors to occur here!
		graph.commit();
    	
		
    	//add here if name is already exist or not 
        //also add login functionality
        //when person login he can see his previous messages
        
    	list2();
        return ok(chatpage.render());
    }
    public Result login(){
    	DynamicForm requestData = Form.form().bindFromRequest();
        String inputName = requestData.get("loginname");
        String inputPassword = requestData.get("loginpassword");
        try{
    	 for (Vertex v : graph.getVertices("User.name", inputName))
    		 if(v.getProperty("password").equals(inputPassword)){
                 list2();
                 
    			 return ok(chatpage.render());
             }
        }catch(Exception e){
        	
        }
    	
    	 return ok("error");
    }
    public Result logout(){
    	
    	
    	return ok("You logged out !!!!");
    }
    
    public void data(WebSocket.In<JsonNode> in, WebSocket.Out<JsonNode> out){
    	ArrayNode m;
    	ObjectNode event2 = Json.newObject();
  		 for (Vertex v : graph.getVertices()){
  	    		event2.put("name", v.getProperty("name").toString());
  	    		event2.put("rid", v.getId().toString());
  	    		//System.out.println((String)v.getProperty("name"));
  	    		//System.out.println(event2.get("name"));
  	    		m = event2.putArray("members");
  	    		m.add(v.getProperty("name").toString());
  	    		m.add(v.getId().toString());
  	    		System.out.println(m);
  	    		out.write(m);
  	            	
  		 }
    }
    
    public WebSocket<JsonNode> list2(){
    	
    	System.out.println("in list2");
    	return new WebSocket<JsonNode>(){
    	   
    		public void onReady(WebSocket.In<JsonNode> in, WebSocket.Out<JsonNode> out){
    		
    			  data(in,out);
    			  in.onMessage(new Callback<JsonNode>() {
    	              public void invoke(JsonNode event) {
    	            	   
    	                   
    	            	 System.out.println(event.get("text").asText()); 
    	                 
    	                  System.out.println("i am in onmessage");
    	              } 
    	           });
    	 } 
    };
      	
    }
    
    public  WebSocket<JsonNode> chat2() {
        return new WebSocket<JsonNode>() {
            
            // Called when the Websocket Handshake is done.
            public void onReady(WebSocket.In<JsonNode> in, WebSocket.Out<JsonNode> out){
                
                // Join the chat room.
                try { 
                    ChatRoom.join(in, out);
                   
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
    }

}
