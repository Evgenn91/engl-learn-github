package com.github.Evgenn91.englishlearning.vocabulary.service;

import com.github.Evgenn91.englishlearning.vocabulary.WordMapper;
import com.github.Evgenn91.englishlearning.vocabulary.WordRepository;
import com.github.Evgenn91.englishlearning.vocabulary.dto.WordDto;
import com.github.Evgenn91.englishlearning.vocabulary.entity.WordEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;
    private final WordMapper wordMapper;

    @Override
    public List<WordDto> getWords(int quantity) {
        Pageable limit = PageRequest.of(0, quantity);
        List<WordEntity> wordEntities = wordRepository.findByOrderByFrequencyCountDesc(limit);
        return wordMapper.toDtos(wordEntities);
    }

    @Override
    public List<WordDto> getWords(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        List<WordEntity> wordEntities = wordRepository.findByOrderByFrequencyCountDesc(pageable);
        return wordMapper.toDtos(wordEntities);
    }

//    public List<WordEntity> getRecordsRange(int from, int to) {
//        int size = to - from; // Количество элементов (например, 20 - 10 = 10)
//        int page = from / size; // Номер страницы (например, 10 / 10 = 1)
//
//        Pageable pageable = PageRequest.of(page, size);
//        return wordRepository.findByOrderByFrequencyCountDesc(pageable);
//    }
}
