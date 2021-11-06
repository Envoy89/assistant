package com.theruzil.assistant.unit.controller;

import com.theruzil.assistant.service.AnswerService;
import com.theruzil.assistant.service.CommandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest
@MockBean(AnswerService.class)
@MockBean(CommandService.class)
public class AnswerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getAnswerTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/answer").param("question", "test"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
