package com.theruzil.assistant.repository;

import com.theruzil.assistant.entity.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer> {
    List<AnswerEntity> findByWordsContains(String word);

}
