package com.github.Evgenn91.englishlearning.vocabulary.domain;

import java.util.List;
import java.util.UUID;

public class Word {
    private long frequencyCount;
    private String mainPartOfSpeech;
    private List<PartOfSpeech> partsOfSpeech;

    private String word;
    private List<WordMeaning> meanings;

    public Word(UUID uuid, String text, int frequencyRank) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException(
                    "Word text cannot be empty"
            );
        }

        if (frequencyRank < 1) {
            throw new IllegalArgumentException(
                    "Frequency rank must be positive"
            );
        }


    }

}
