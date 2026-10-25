package com.github.Evgenn91.englishlearning.vocabulary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "word")
@Setter
@Getter
public class WordEntity {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "word", nullable = false, updatable = false)
    private String word;

    @Column(name = "frequency_count", nullable = false, updatable = false)
    private long frequencyCount;
}
