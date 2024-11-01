package com.example.seminar4.card.controller;

import com.example.seminar4.card.dto.CardRequest;
import com.example.seminar4.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/card")
@RestController
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @PostMapping("")
    public void createCard(@RequestBody CardRequest.CardCreateRequest req) {
        cardService.CreateCard(req);
    }
}
