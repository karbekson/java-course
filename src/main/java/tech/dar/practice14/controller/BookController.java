package tech.dar.practice14.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.dar.practice14.model.dto.BookCreateRequest;
import tech.dar.practice14.model.dto.BookGetFilter;
import tech.dar.practice14.model.entity.Book;
import tech.dar.practice14.service.BookService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(
            BookGetFilter filter
    ) {
        return bookService.getAllBooks(filter);
    }

    @PostMapping
    public Book createBook(
            @RequestBody @Valid BookCreateRequest request
    ) {
        return bookService.createBook(request);
    }

}
