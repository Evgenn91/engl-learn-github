package com.github.Evgenn91.englishlearning.vocabulary;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Table(name = "user")
@Setter
@Getter
public class UserEntity {
    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false, length = 36)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;
}
