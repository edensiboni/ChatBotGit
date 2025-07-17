package com.example.chatbot;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ChatController {

    private final ChatService chatService = AiServices.create(
        ChatService.class,
        OpenAiChatModel.withApiKey(System.getenv("OPENAI_API_KEY"))
    );

    @PostMapping("/chat")
    public String chat(@RequestBody String message) {
        return chatService.chat(message);
    }
}
