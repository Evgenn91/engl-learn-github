package com.github.Evgenn91.englishlearning.vocabulary.adapter.outt.persistence;


import jakarta.persistence.Column;



public class WordEntity1  {

    @Column(name = "frequency_count")
    private long frequencyCount;

    @Column(name = "main_part_of_speech")
    private String mainPartOfSpeech;

    @Column(name = "word")
    private String word;
//todo разобраться как делать в hibernate
//    private List<PartOfSpeech> partsOfSpeech;
//    private List<WordMeaning> meanings;
}
