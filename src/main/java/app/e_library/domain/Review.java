package app.e_library.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Reviews")
public class Review {
    @Id
    @SequenceGenerator(
            name = "review_sequence",
            sequenceName = "review_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "review_sequence"
    )
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonProperty("customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "library_id")
    @JsonProperty("library_id")
    private Library library;
    @ManyToOne
    @JoinColumn(name = "book_id")
    @JsonProperty("book_id")
    private Book book;
    @JsonProperty("rating")
    private Integer rating;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("reviewDate")
    private LocalDate reviewDate;

    public Review() {
    }

    public Review(Customer customer, Library library, Book book, Integer rating, String comment, LocalDate reviewDate) {
        this.customer = customer;
        this.library = library;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
    }

    public Review(Long id, Customer customer, Library library, Book book, Integer rating, String comment, LocalDate reviewDate) {
        this.id = id;
        this.customer = customer;
        this.library = library;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
    }
}
