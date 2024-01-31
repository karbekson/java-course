package tech.dar.practice14.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.dar.practice14.model.dto.BookCreateRequest;
import tech.dar.practice14.model.dto.BookGetFilter;
import tech.dar.practice14.model.entity.Book;
import tech.dar.practice14.repository.BookRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepo;

    public List<Book> getAllBooks(BookGetFilter filter) {
//        return bookRepo.findAllByTitleLike("%" + filter.getTitle() + "%");
        return bookRepo.customFindAll();
    }

    public Book createBook(BookCreateRequest request) {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setDescription(request.getDescription());
        book = bookRepo.save(book);
        return book;
    }

}
