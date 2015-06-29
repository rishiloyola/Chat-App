package models;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.*;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;
import java.lang.*;

import akka.actor.*;
import akka.dispatch.*;
import static akka.pattern.Patterns.ask;
import akka.actor.UntypedActor;
import java.util.*;

import static java.util.concurrent.TimeUnit.*;

import akka.actor.Deploy;
import play.api.libs.concurrent.Akka;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class ChatRoom {
	   static Map<String, WebSocket.Out<JsonNode>> members2;
	   static Map<String, WebSocket.Out<JsonNode>> members = new HashMap<String, WebSocket.Out<JsonNode>>();
       static int count=0;
    //static ActorRef defaultRoom = Akka.system().actorOf(new Props(ChatRoom.class));
	//static ActorRef defaultRoom = Actors.actorOf(ChatRoom.class);
	
    public static void join(WebSocket.In<JsonNode> in, WebSocket.Out<JsonNode> out) throws Exception{
         
    	add(out);
    	  in.onMessage(new Callback<JsonNode>() {
              public void invoke(JsonNode event) {
            	   
                   
                  ChatRoom.notifyAll(event.get("name2").asText());
                  // Send a Talk message to the room.
                 // defaultRoom.tell(new Talk(username, event.get("text").asText()));
                  System.out.println("i am in join");
              } 
           });
    	
    }

	/*public void onReceive(Object message) throws Exception {
		// TODO Auto-generated method stub
		 
         // Check if this username is free.
		 if(message instanceof Join) {
			 
			 Join join = (Join)message;
             members.put(join.username, join.channel);
             notifyAll("join", join.username, "has entered the room");
             
         }else if(message instanceof Talk)  {
        
        // Received a Talk message
        Talk talk = (Talk)message;
        
        notifyAll("talk", talk.username, talk.text);
        
    }
}*/
    public static void add(WebSocket.Out<JsonNode> channel){
    	
    	 members.put("name",channel);
    	
    }
	 public static void notifyAll(String text) {
		 
		 
	        for(WebSocket.Out<JsonNode> channel: members.values()) {
	            
	        
	            ObjectNode event = Json.newObject();
	            event.put("message", text);
	        	System.out.println("i am in notigyall");
	        	System.out.println(text);
	            channel.write(event);
	        }
	    }
	    
   
}


