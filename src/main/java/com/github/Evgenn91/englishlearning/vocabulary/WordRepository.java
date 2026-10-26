package com.github.Evgenn91.englishlearning.vocabulary;

import com.github.Evgenn91.englishlearning.vocabulary.entity.WordEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface WordRepository extends JpaRepository<WordEntity, UUID> {

    List<WordEntity> findByOrderByFrequencyCountDesc(Pageable pageable);

    //от меньшего к большему сортировка
    List<WordEntity> findByOrderByFrequencyCountAsc(Pageable pageable);
}
