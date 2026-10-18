package com.github.Evgenn91.englishlearning.vocabulary.adapter.outt.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SpringDataWordRepository extends CrudRepository<WordEntity, Long> {
    Optional<WordEntity> findByWord(String word);
}
