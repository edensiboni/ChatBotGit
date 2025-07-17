package com.example.chatbot;

import dev.langchain4j.service.AiService;
import dev.langchain4j.service.UserMessage;

@AiService
public interface ChatService {
    String chat(@UserMessage String userMessage);
}
