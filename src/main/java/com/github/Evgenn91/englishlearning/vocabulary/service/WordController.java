package com.github.Evgenn91.englishlearning.vocabulary.service;

import com.github.Evgenn91.englishlearning.vocabulary.dto.WordDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

//    /chats?quantity=20
    @GetMapping("/chats")
    public ResponseEntity<List<WordDto>> getWords(
            @RequestParam(name = "quantity", defaultValue = "10") int quantity){
        List<WordDto> response = wordService.getWords(quantity);
        return ResponseEntity.ok(response);
    }

//    GET /chats?page=1&size=10
    @GetMapping("/chatss")
    public ResponseEntity<List<WordDto>> getWords(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {

        // Передаем page и size напрямую в сервис, а оттуда в PageRequest.of(page, size)
        List<WordDto> response = wordService.getWords(page, size);
        return ResponseEntity.ok(response);
    }
}
