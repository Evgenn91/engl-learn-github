package com.github.Evgenn91.englishlearning.vocabulary.adapter.outt.persistence;

import java.util.Optional;

public interface SpringDataWordRepository /*extends CrudRepository<WordEntity, Long>*/ {
    Optional<WordEntity1> findByWord(String word);
}
