package com.theruzil.assistant.controller;

import com.theruzil.assistant.domain.BaseCommand;
import com.theruzil.assistant.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {

    @Autowired
    private CommandService commandService;

    /*
        Command rules:
            Get an answer to a question: Answer: you question
                if answer don't exist in base, you get default answer or answer from Google
     */
    @GetMapping(path = "/command")
    public String givCommand(@RequestParam String command) {
        BaseCommand com = BaseCommand.build(command);
        return commandService.giveCommand(com);
    }
}
