package com.example.seminar4.book.controller;

import com.example.seminar4.book.dto.BookRequest;
import com.example.seminar4.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @PostMapping("/{userId}")
    public void createBook(@PathVariable Long userId,
                           @RequestBody BookRequest.BookCreateRequest req) {
        bookService.createBook(userId,req);
    }
}
