package com.theruzil.assistant.unit.jpa;

import com.theruzil.assistant.entity.AnswerEntity;
import com.theruzil.assistant.repository.AnswerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AnswerJpaTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    AnswerRepository answerRepository;

    @Test
    public void persistAndReadAnswerTest() {
        AnswerEntity answerEntity = new AnswerEntity(0, "test", "test");
        answerEntity = testEntityManager.persist(answerEntity);

        Assert.assertNotNull(answerRepository.findById(answerEntity.getId()));
    }
}
