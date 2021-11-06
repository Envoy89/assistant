package com.theruzil.assistant.unit.service.CommandService;

import com.theruzil.assistant.service.CommandService;
import com.theruzil.assistant.service.impl.CommandServiceImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class CommandServiceTestConfig {

    @Bean
    public CommandService commandService() {
        return new CommandServiceImpl();
    }
}
