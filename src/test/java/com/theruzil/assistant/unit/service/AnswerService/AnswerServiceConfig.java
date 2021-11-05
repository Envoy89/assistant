package com.theruzil.assistant.unit.service.AnswerService;

import com.theruzil.assistant.service.AnswerService;
import com.theruzil.assistant.service.impl.AnswerServiceImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class AnswerServiceConfig {

    @Bean
    public AnswerService answerService() {
        return new AnswerServiceImpl();
    }
}
