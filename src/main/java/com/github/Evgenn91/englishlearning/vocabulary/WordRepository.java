package com.github.Evgenn91.englishlearning.vocabulary;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WordRepository extends JpaRepository<WordEntity, UUID> {
}
