package com.github.Evgenn91.englishlearning.vocabulary.service;

import com.github.Evgenn91.englishlearning.vocabulary.entity.WordEntity;
import com.github.Evgenn91.englishlearning.vocabulary.WordRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WordImportService {
    private final WordRepository wordRepository;

    @Transactional
    public void initializeWords() {
        if (wordRepository.count() > 0) {
            return;
        }

        List<WordEntity> words = loadWordsFromCsv();

        wordRepository.saveAll(words);
    }

    private List<WordEntity> loadWordsFromCsv() {
        List<WordEntity> words = new ArrayList<>();

        try (Reader reader = new InputStreamReader(
                new ClassPathResource("data/words.csv")
                        .getInputStream(),
                StandardCharsets.UTF_8
        );
             CSVParser parser = CSVFormat.DEFAULT.builder()
                     .setHeader()
                     .setSkipHeaderRecord(true)
                     .get()
                     .parse(reader)) {

            for (CSVRecord record : parser) {
                WordEntity entity = new WordEntity();

                entity.setId(UUID.randomUUID());
                entity.setWord(record.get("Word"));
                entity.setFrequencyCount(
                        Long.parseLong(record.get("FREQcount"))
                );

                words.add(entity);
            }

        } catch (IOException e) {
            throw new IllegalStateException(
                    "Не удалось загрузить слова из CSV", e
            );
        }

        return words;
    }
}
