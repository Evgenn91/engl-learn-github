package com.github.Evgenn91.englishlearning.vocabulary;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WordDataInitializer implements ApplicationRunner {
    private final WordImportService wordImportService;

    @Override
    public void run(ApplicationArguments args) {
        wordImportService.initializeWords();
    }
}
