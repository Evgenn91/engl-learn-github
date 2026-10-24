package com.github.Evgenn91.englishlearning.vocabulary.adapter.outt.persistence;


import com.github.Evgenn91.englishlearning.entity.AuditIdEntity;
import com.github.Evgenn91.englishlearning.entity.DeleteAuditIdEntity;
import com.github.Evgenn91.englishlearning.vocabulary.domain.PartOfSpeech;
import com.github.Evgenn91.englishlearning.vocabulary.domain.WordMeaning;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.util.List;



public class WordEntity1 extends DeleteAuditIdEntity {

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
