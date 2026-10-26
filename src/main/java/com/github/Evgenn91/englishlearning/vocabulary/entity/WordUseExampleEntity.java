package com.github.Evgenn91.englishlearning.vocabulary.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "word_use_example")
@Setter
@Getter
public class WordUseExampleEntity {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "user_id", nullable = false, updatable = false)
    private UUID userId;

    @Column(name = "word_id", nullable = false, updatable = false)
    private UUID wordId;

    @Column(name = "example", nullable = false)
    private String example;

    @Column(name = "translate", nullable = false)
    private String translate;
}
