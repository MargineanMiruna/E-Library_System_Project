package app.e_library.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table
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
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    private Integer rating;
    private String comment;
    private LocalDate reviewDate;

    public Review() {
    }

    public Review(Long id, Customer customer, Library library, Book book, Integer rating, String comment) {
        this.id = id;
        this.customer = customer;
        this.library = library;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = LocalDate.now();
    }

    public Review(Customer customer, Library library, Book book, Integer rating, String comment, LocalDate reviewDate) {
        this.customer = customer;
        this.library = library;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
    }
}
