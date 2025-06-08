package com.chat.app.controller;

import com.chat.app.modal.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    //   /app/sendMessage-complete endpoint
    @MessageMapping("/sendMessage")  //client send message to this endpoint
    @SendTo("/topic/messages")        // sendMessage return to all client who subscribe....this topic.
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }
    @GetMapping("chat")           // thymeleaf
    public String chat(){
        return "chat";
    }
}
