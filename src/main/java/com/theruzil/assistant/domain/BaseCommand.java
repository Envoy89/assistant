package com.theruzil.assistant.domain;

import lombok.Getter;

@Getter
public class BaseCommand {
    private CommandType type;
    private String text;

    private BaseCommand(CommandType type, String text) {
        this.type = type;
        this.text = text;
    }

    public static BaseCommand build(String command) {
        if (command.contains(CommandType.ANSWER.getTypeWord())) {
            String question = command.replace(CommandType.ANSWER.getTypeWord(), "");
            return new BaseCommand(CommandType.ANSWER, question);
        }
        return new BaseCommand(CommandType.DEFAULT, command);
    }
}
