package com.theruzil.assistant.domain;

import lombok.Getter;

@Getter
public enum CommandType {
    ANSWER("Answer:"),
    DEFAULT("");

    private String typeWord;

    CommandType(String typeWord) {
        this.typeWord = typeWord;
    }
}
