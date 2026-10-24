package com.github.Evgenn91.englishlearning.vocabulary;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Table(name = "progress_learn_word")
@Setter
@Getter
public class ProgressLearnWord {
    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false, length = 36)
    private UUID id;

    @Column(name = "user_id", nullable = false, updatable = false, length = 36)
    private UUID userId;

    @Column(name = "word_id", nullable = false, updatable = false, length = 36)
    private UUID wordId;

    @Column(name = "learn_date", nullable = false)
    private LocalDate learnDatetime;

    @Column(name = "next_learn_date")
    private LocalDate nextLearnData;
}
