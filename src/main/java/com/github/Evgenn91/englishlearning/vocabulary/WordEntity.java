package com.github.Evgenn91.englishlearning.vocabulary;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Table(name = "word")
@Setter
@Getter
public class WordEntity {
    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false, length = 36)
    private UUID id;

    @Column(name = "word", nullable = false, updatable = false)
    private String word;

    @Column(name = "frequency_count", nullable = false, updatable = false)
    private long frequencyCount;
}
