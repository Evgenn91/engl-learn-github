package com.github.Evgenn91.englishlearning.vocabulary.adapter.outt.persistence;

import com.github.Evgenn91.englishlearning.vocabulary.domain.Word;
import com.github.Evgenn91.englishlearning.vocabulary.port.outt.WordRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class WordPersistenceAdapter implements WordRepository {
    private final SpringDataWordRepository springDataRepository;
    private final WordMapper wordMapper;

    public WordPersistenceAdapter(
            SpringDataWordRepository springDataRepository,
            WordMapper wordMapper
    ) {
        this.springDataRepository = springDataRepository;
        this.wordMapper = wordMapper;
    }

    @Override
    public Optional<Word> findByText(String text) {
        return springDataRepository.findByWord(text)
                .map(wordMapper::toDomain);
    }

    @Override
    public Optional<Word> findById(String id) {
        return springDataRepository.findById(Long.valueOf(id))
                .map(wordMapper::toDomain);
    }

    @Override
    public void save(Word word) {
        WordEntity entity = wordMapper.toEntity(word);
        springDataRepository.save(entity);
    }
}
