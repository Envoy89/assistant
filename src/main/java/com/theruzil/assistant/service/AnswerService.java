package com.theruzil.assistant.service;

import com.theruzil.assistant.entity.AnswerEntity;

public interface AnswerService {
    String getAnswer(String question);
    AnswerEntity addAnswer(AnswerEntity answer);
}
