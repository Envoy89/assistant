package com.theruzil.assistant.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "answer_table")
public class AnswerEntity {
    @Id
    @GeneratedValue
    private int id;

    private String text;

    private String words;
}
