package com.example.controller;

import com.example.service.SongsService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/songs")
@RequiredArgsConstructor
public class SongsController {

    private final SongsService songsService;

    @GetMapping("/top-songs")
    public void receiveTopSongs(){
        songsService.getTop100Songs();
    }

}
