package com.github.Evgenn91.englishlearning.vocabulary.domain;

import java.util.List;

public class Word {
    private long frequencyCount;
    private String mainPartOfSpeech;
    private List<PartOfSpeech> partsOfSpeech;

    private String word;
    private List<WordMeaning> meanings;

    public long getFrequencyCount() {
        return frequencyCount;
    }

    public void setFrequencyCount(long frequencyCount) {
        this.frequencyCount = frequencyCount;
    }

    public String getMainPartOfSpeech() {
        return mainPartOfSpeech;
    }

    public void setMainPartOfSpeech(String mainPartOfSpeech) {
        this.mainPartOfSpeech = mainPartOfSpeech;
    }

    public List<PartOfSpeech> getPartsOfSpeech() {
        return partsOfSpeech;
    }

    public void setPartsOfSpeech(List<PartOfSpeech> partsOfSpeech) {
        this.partsOfSpeech = partsOfSpeech;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<WordMeaning> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<WordMeaning> meanings) {
        this.meanings = meanings;
    }
}
