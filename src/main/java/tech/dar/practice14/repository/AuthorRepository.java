package tech.dar.practice14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.dar.practice14.model.entity.Author;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> findByName(String name);

}
