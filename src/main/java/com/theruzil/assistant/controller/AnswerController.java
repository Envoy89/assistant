package com.theruzil.assistant.controller;

import com.theruzil.assistant.entity.AnswerEntity;
import com.theruzil.assistant.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping
    public String getAnswer(@RequestParam String question) {
        return answerService.getAnswer(question);
    }

    @PostMapping
    public AnswerEntity addAnswer(@RequestBody AnswerEntity answer) {
        return answerService.addAnswer(answer);
    }
}
