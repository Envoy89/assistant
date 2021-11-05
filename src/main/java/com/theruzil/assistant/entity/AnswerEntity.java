package com.theruzil.assistant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answer_table")
public class AnswerEntity {
    @Id
    @GeneratedValue
    private int id;

    private String text;

    private String words;
}
