package com.theruzil.assistant.unit.service.CommandService;

import com.theruzil.assistant.domain.BaseCommand;
import com.theruzil.assistant.service.AnswerService;
import com.theruzil.assistant.service.CommandService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommandServiceTestConfig.class)
public class CommandServiceTest {

    @MockBean
    AnswerService answerService;

    @Autowired
    CommandService commandService;

    @Test
    public void giveCommandTest() {
        BaseCommand command = BaseCommand.build("test");

        String actualResult = commandService.giveCommand(command);

        Assert.assertEquals("test", actualResult);
    }
}
