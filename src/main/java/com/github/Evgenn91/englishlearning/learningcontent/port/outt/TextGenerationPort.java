package com.github.Evgenn91.englishlearning.learningcontent.port.outt;

import com.github.Evgenn91.englishlearning.learningcontent.domain.ExampleSentence;

import java.util.List;

//интерфейс для обращения к локальной ии модели
public interface TextGenerationPort {
    List<ExampleSentence> generateExamples(
            String word,
            int count
    );
}
