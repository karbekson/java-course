package tech.dar.practice14.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Document
public class Author implements Serializable {

    @Id
    private String id;
    private String name;
    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    List<Book> books;

}
