package com.github.Evgenn91.englishlearning.vocabulary.port.outt;

import com.github.Evgenn91.englishlearning.vocabulary.domain.Word;

import java.util.Optional;

public interface WordRepository {
    Optional<Word> findByText(String text);

    Optional<Word> findById(String id);

    void save(Word word);
}
