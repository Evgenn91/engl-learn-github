package com.github.Evgenn91.englishlearning;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class WordDataLoaderTest {

    @Test
    void shouldHaveWordsCsvFileWithData() throws IOException {
        Path csvPath = Path.of("words.csv");

        assertTrue(Files.exists(csvPath), "Файл words.csv не найден");
        assertTrue(Files.isRegularFile(csvPath), "words.csv не является обычным файлом");
        assertTrue(Files.size(csvPath) > 0, "Файл words.csv пуст");
    }

    @Test
    void shouldLoadWordsFromCsv() {
        WordDataLoader loader = new WordDataLoader();

        var words = loader.getWords();

        assertFalse(words.isEmpty());
        assertNotNull(words.get(0).getWord());
        assertTrue(words.get(0).getFrequencyCount() > 0);
    }
}
