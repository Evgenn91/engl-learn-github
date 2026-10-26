package com.github.Evgenn91.englishlearning.vocabulary;

import com.github.Evgenn91.englishlearning.vocabulary.dto.WordDto;
import com.github.Evgenn91.englishlearning.vocabulary.entity.WordEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WordMapper {
    WordDto toDto(WordEntity entity);

    List<WordDto> toDtos(List<WordEntity> entity);
}
