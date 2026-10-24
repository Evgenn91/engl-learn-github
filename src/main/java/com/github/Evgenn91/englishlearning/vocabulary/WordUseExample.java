package com.github.Evgenn91.englishlearning.vocabulary;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Table(name = "word_use_example")
@Setter
@Getter
public class WordUseExample {
    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false, length = 36)
    private UUID id;

    @Column(name = "user_id", nullable = false, updatable = false, length = 36)
    private UUID userId;

    @Column(name = "word_id", nullable = false, updatable = false, length = 36)
    private UUID wordId;

    @Column(name = "example", nullable = false)
    private String example;

    @Column(name = "translate", nullable = false)
    private String translate;
}
