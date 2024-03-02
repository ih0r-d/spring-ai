package com.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.Generation;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongsService {

    private final OpenAiChatClient aiClient;


    public void getTop100Songs(){
        var question = """
                What was the year-end number-one single on the Billboard Top 100 in 2020?
                """;
        Prompt prompt = new Prompt(question);

        ChatResponse response = aiClient.call(prompt);
        List<Generation> results = response.getResults();
        System.out.println("results = " + results);
    }
}
