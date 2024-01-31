package tech.dar.practice14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tech.dar.practice14.model.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByTitleLike(String title);

    @Query(nativeQuery = true, value = "SELECT * FROM BootAuthor WHERE id = 1")
    List<Book> customFindAll();

}
