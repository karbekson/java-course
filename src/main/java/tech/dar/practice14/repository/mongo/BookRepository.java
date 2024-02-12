package tech.dar.practice14.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.dar.practice14.model.dao.BookDao;
import tech.dar.practice14.model.entity.Author;
import tech.dar.practice14.model.entity.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findAllByTitleLike(String title);

    List<Book> findAllByTitleLikeAndAuthor_NameLike(String title, String authorName);

//    @Query(nativeQuery = true, value = "" +
//            " SELECT b.id, b.title, b.description, a.name AS authorName" +
//            " FROM book b" +
//            " INNER JOIN author a ON b.author_id = a.id"
//    )
//    List<BookDao> findAllByTitleAndAuthor();

}
