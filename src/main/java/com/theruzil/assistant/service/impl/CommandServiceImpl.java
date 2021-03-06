package com.theruzil.assistant.service.impl;

import com.theruzil.assistant.domain.BaseCommand;
import com.theruzil.assistant.domain.CommandType;
import com.theruzil.assistant.service.AnswerService;
import com.theruzil.assistant.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CommandServiceImpl implements CommandService {

    @Autowired
    private AnswerService answerService;

    @Value("${baseCommandReturn}")
    private String baseCommandReturn;

    public String giveCommand(BaseCommand command) {
        if (command.getType() == CommandType.ANSWER) {
            return answerService.getAnswer(command.getText());
        }

        return baseCommandReturn;
    }
}
