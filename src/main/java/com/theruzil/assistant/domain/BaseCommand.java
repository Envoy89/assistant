package com.theruzil.assistant.domain;

import lombok.Getter;

@Getter
public class BaseCommand {
    private CommandType type;
    private String text;

    private BaseCommand(CommandType type, String text) {
        this.text = text;
        this.type = type;
    }

    public static BaseCommand build(String command) {
        if (command.contains("answer")) {
            return new BaseCommand(CommandType.ANSWER, command);
        }
        return new BaseCommand(CommandType.DEFAULT, command);
    }
}
