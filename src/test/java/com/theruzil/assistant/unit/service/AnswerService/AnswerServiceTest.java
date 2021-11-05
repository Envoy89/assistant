package com.theruzil.assistant.unit.service.AnswerService;

import com.theruzil.assistant.entity.AnswerEntity;
import com.theruzil.assistant.repository.AnswerRepository;
import com.theruzil.assistant.service.AnswerService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AnswerServiceConfig.class)
class AnswerServiceTest {
    @MockBean
    AnswerRepository answerRepository;

    @Autowired
    AnswerService answerService;

    @Test
    public void getAnswerTest() {
        final String answer = "test test";
        final String words = "test";

        when(answerRepository.findByWordsContains(anyString())).thenReturn(Collections.singletonList(new AnswerEntity(0, answer, words)));
        String actualAnswer = answerService.getAnswer(words);

        assertEquals(answer, actualAnswer);
    }
}