package tech.dar.practice14.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.dar.practice14.model.dto.AuthorCreateRequest;
import tech.dar.practice14.model.entity.Author;
import tech.dar.practice14.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AuthorService {

    private final AuthorRepository authorRepo;

    public List<Author> getAllAuthors() {
        List<Author> authors = authorRepo.findAll();
        return authors;
    }

    public Author getOrCreateAuthor(String name) {
        Optional<Author> optional = authorRepo.findByName(name);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            Author author = new Author();
            author.setName(name);
//            author.setBirthDate(request.getBirthDate());
            return authorRepo.save(author);
        }

    }

}
