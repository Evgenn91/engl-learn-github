package com.github.Evgenn91.englishlearning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
//@Getter
//@Setter
public class IdEntity {
    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false, length = 36)
    private UUID id;
}
