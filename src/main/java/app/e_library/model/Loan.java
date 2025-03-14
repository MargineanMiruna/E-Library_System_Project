package app.e_library.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Loans")
public class Loan {
    @Id
    @SequenceGenerator(
            name = "loan_sequence",
            sequenceName = "loan_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "loan_sequence"
    )
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonProperty("customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "book_id")
    @JsonProperty("book_id")
    private Book book;
    @JsonProperty("loanDate")
    private LocalDate loanDate;
    @JsonProperty("returnDate")
    private LocalDate returnDate;
    @JsonProperty("status")
    private String status;

    public Loan() {
    }

    public Loan(Customer customer, Book book, LocalDate loanDate, LocalDate returnDate, String status) {
        this.customer = customer;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public Loan(Long id, Customer customer, Book book, LocalDate loanDate, LocalDate returnDate, String status) {
        this.id = id;
        this.customer = customer;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
    }
}
