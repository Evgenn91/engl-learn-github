package com.github.Evgenn91.englishlearning.vocabulary.dto;

import jakarta.persistence.Column;

import java.util.UUID;

public record WordDto(
        UUID id,
        String word,
        long frequencyCount
) {
}
