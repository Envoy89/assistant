package com.theruzil.assistant.service.impl;

import com.theruzil.assistant.entity.AnswerEntity;
import com.theruzil.assistant.repository.AnswerRepository;
import com.theruzil.assistant.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerRepository repository;

    @Override
    public String getAnswer(String question) {
        List<AnswerEntity> answerEntityList = repository.findByWordsContains(question);

        if (answerEntityList != null && answerEntityList.size() > 0) {
            return answerEntityList.get(0).getText();
        } else {
            return "test";
        }
    }
}
