package com.github.Evgenn91.englishlearning.vocabulary.service;

import com.github.Evgenn91.englishlearning.vocabulary.dto.WordDto;
import com.github.Evgenn91.englishlearning.vocabulary.entity.WordEntity;

import java.util.List;

public interface WordService {
    List<WordDto> getWords(int quantity);

    List<WordDto> getWords(int page, int size);
}
