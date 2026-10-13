package com.github.Evgenn91.englishlearning.vocabulary.application;

import com.github.Evgenn91.englishlearning.vocabulary.domain.Word;
import com.github.Evgenn91.englishlearning.vocabulary.port.outt.WordRepository;

import java.util.Optional;

public class FindWordUseCase {
    private final WordRepository wordRepository;

    public FindWordUseCase(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public Optional<Word> execute(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException(
                    "Word text cannot be empty"
            );
        }

        return wordRepository.findByText(text.trim());
    }
}
