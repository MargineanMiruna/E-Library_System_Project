package app.e_library.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Long id;
    private String title;
    private List<String> authors;
    private String publishingHouse;
    private String isbn;
    private Integer releaseYear;
    private String description;
    private String language;
    private String coverImage;
    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;
    private Boolean available;
    private Float rating;


    public Book() {}

    public Book(Long id, String title, List<String> authors, String publishingHouse, String isbn, Integer releaseYear, String description, String language, String coverImage, Library library, Boolean available, Float rating) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.isbn = isbn;
        this.releaseYear = releaseYear;
        this.description = description;
        this.language = language;
        this.coverImage = coverImage;
        this.library = library;
        this.available = available;
        this.rating = rating;
    }

    public Book(String title, List<String> authors, String publishingHouse, String isbn, Integer releaseYear, String description, String language, String coverImage, Library library, Boolean available, Float rating) {
        this.title = title;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.isbn = isbn;
        this.releaseYear = releaseYear;
        this.description = description;
        this.language = language;
        this.coverImage = coverImage;
        this.library = library;
        this.available = available;
        this.rating = rating;
    }
}
