package com.github.Evgenn91.englishlearning.vocabulary.domain;

public class Word {
    private final String id;
    private final String text;
    private final int frequencyRank;

    public Word(String id, String text, int frequencyRank) {
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

        this.id = id;
        this.text = text;
        this.frequencyRank = frequencyRank;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getFrequencyRank() {
        return frequencyRank;
    }
}
