package tech.dar.practice14.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.dar.practice14.model.entity.Author;
import tech.dar.practice14.service.AuthorService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("authors")
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public Author createAuthor(
            @RequestParam("name") String name
    ) {
        return authorService.getOrCreateAuthor(name);
    }

}
