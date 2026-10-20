package com.github.Evgenn91.englishlearning;

import com.github.Evgenn91.englishlearning.vocabulary.domain.PartOfSpeech;
import com.github.Evgenn91.englishlearning.vocabulary.domain.Word;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

class WordDataLoader {
    private final List<Word> words;

    public WordDataLoader() {
        this.words = new ArrayList<>();
        try {
            loadWords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadWords() throws IOException {
        try (Reader reader = Files.newBufferedReader(
                Path.of("words.csv"),
                StandardCharsets.UTF_8
        );
             CSVParser parser = CSVFormat.DEFAULT.builder()
                     .setHeader()
                     .setSkipHeaderRecord(true)
                     .get()
                     .parse(reader)) {

            for (CSVRecord record : parser) {
                Word word = new Word();

                word.setWord(record.get("Word"));
                word.setFrequencyCount(
                        Long.parseLong(record.get("FREQcount"))
                );
                word.setMainPartOfSpeech(
                        record.get("Dom_PoS_SUBTLEX")
                );
                word.setPartsOfSpeech(
                        parsePartsOfSpeech(
                                record.get("All_PoS_SUBTLEX")
                        )
                );

                words.add(word);
            }
        }
    }

    private List<PartOfSpeech> parsePartsOfSpeech(String value) {
        return Arrays.stream(value.split("\\."))
                .map(this::toPartOfSpeech)
                .distinct()
                .toList();
    }

    private PartOfSpeech toPartOfSpeech(String value) {
        try {
            return PartOfSpeech.valueOf(
                    value.trim().toUpperCase(Locale.ROOT)
            );
        } catch (IllegalArgumentException e) {
            return PartOfSpeech.OTHER;
        }
    }

    public List<Word> getWords() {
        return words;
    }

}
