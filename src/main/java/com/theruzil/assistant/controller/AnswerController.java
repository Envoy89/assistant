package com.theruzil.assistant.controller;

import com.theruzil.assistant.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @GetMapping
    public String getAnswer(@RequestParam String question) {
        return answerService.getAnswer(question);
    }
}
