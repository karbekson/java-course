//package tech.dar.practice14.repository.mysql;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import tech.dar.practice14.model.dao.BookDao;
//import tech.dar.practice14.model.entity.Book;
//
//import java.util.List;
//
//public interface BookRepository extends JpaRepository<Book, Long> {
//
//    List<Book> findAllByTitleLike(String title);
//
//    List<Book> findAllByTitleLikeAndAuthor_NameLike(String title, String authorName);
//
//    @Query(nativeQuery = true, value = "" +
//            " SELECT b.id, b.title, b.description, a.name AS authorName" +
//            " FROM book b" +
//            " INNER JOIN author a ON b.author_id = a.id"
//    )
//    List<BookDao> findAllByTitleAndAuthor();
//
//}
