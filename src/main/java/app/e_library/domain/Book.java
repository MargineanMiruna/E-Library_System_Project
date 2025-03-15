package app.e_library.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Books")
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
    @JsonProperty("title")
    private String title;
    @JsonProperty("authors")
    private String authors;
    @JsonProperty("publishingHouse")
    private String publishingHouse;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("releaseYear")
    private Integer releaseYear;
    @JsonProperty("description")
    private String description;
    @JsonProperty("language")
    private String language;
    @JsonProperty("coverImage")
    private String coverImage;
    @ManyToOne
    @JoinColumn(name = "library_id")
    @JsonProperty("library_id")
    private Library library;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("rating")
    private Float rating;

    public Book() {
    }

    public Book(String title, String authors, String publishingHouse, String isbn, Integer releaseYear, String description, String language, String coverImage, Library library, Boolean available, Float rating) {
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

    public Book(Long id, String title, String authors, String publishingHouse, String isbn, Integer releaseYear, String description, String language, String coverImage, Library library, Boolean available, Float rating) {
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
}
