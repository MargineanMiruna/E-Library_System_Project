package app.e_library.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Librarians")
public class Librarian implements User {
    @Id
    @SequenceGenerator(
            name = "librarian_sequence",
            sequenceName = "librarian_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "librarian_sequence"
    )
    private Long id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("username")
    private String username;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @ManyToOne
    @JoinColumn(name = "library_id")
    @JsonProperty("library_id")
    private Library library;

    public Librarian() {
    }

    public Librarian(String firstName, String lastName, String username, String email, String password, Library library) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.library = library;
    }

    public Librarian(Long id, String firstName, String lastName, String username, String email, String password, Library library) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.library = library;
    }

    @Override
    public Long getId() {
        return id;
    }
}
