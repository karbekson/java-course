package tech.dar.practice14.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.dar.practice14.model.dao.BookDao;
import tech.dar.practice14.model.dto.BookCreateRequest;
import tech.dar.practice14.model.dto.BookGetFilter;
import tech.dar.practice14.model.dto.BookUpdateRequest;
import tech.dar.practice14.model.entity.Book;
import tech.dar.practice14.repository.mongo.BookRepository;
//import tech.dar.practice14.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepo;
    private final AuthorService authorService;

    public List<Book> getAllBooks(BookGetFilter filter) {
        return bookRepo.findAll();
//        return bookRepo.findAllByTitleLike("%" + filter.getTitle() + "%");
//        List<Book> books = bookRepo.findAllByTitleLikeAndAuthor_NameLike(
//                "%" + filter.getTitle() + "%",
//                "%" + filter.getAuthorName() + "%"
//        );

//        bookRepo.findAllByTitleAndAuthor().forEach(b -> {
//            System.out.println(
//                    b.getId() + "\n"
//                            + b.getTitle() + "\n"
//                            + b.getDescription() + "\n"
//                            + b.getAuthorName()
//            );
//        });

//        return books;
    }
//
//    public Book createBook(BookCreateRequest request) {
//        Book book = new Book();
//        book.setTitle(request.getTitle());
//        book.setDescription(request.getDescription());
//        book.setAuthor(authorService.getOrCreateAuthor(request.getAuthorName()));
//        book = bookRepo.save(book);
//        return book;
//    }
//
//    public Book getBook(Long id) {
//        validateBookExists(id);
//        Optional<Book> book = bookRepo.findById(id);
//        return book.orElse(null);
//    }
//
//    public Book updateBook(Long id, BookUpdateRequest request) {
//        validateBookExists(id);
//        Book book = getBook(id);
//        if (request.getTitle() != null) {
//            book.setTitle(request.getTitle());
//        }
//        if (request.getDescription() != null) {
//            book.setDescription(request.getDescription());
//        }
//        return bookRepo.save(book);
//    }
//
//    public void deleteBook(Long id) {
//        validateBookExists(id);
//        bookRepo.deleteById(id);
//    }
//
//    private void validateBookExists(Long id) {
//        if (!bookRepo.existsById(id)) {
//            String err = "Book with id = " + id + " not found";
//            System.out.println(err);
//            throw new RuntimeException(err);
//        }
//    }

}
