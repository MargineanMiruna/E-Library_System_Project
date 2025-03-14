package app.e_library.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table
public class Library {
    @Id
    @SequenceGenerator(
            name = "library_sequence",
            sequenceName = "library_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "library_sequence"
    )
    private Long id;
    private String name;
    private String contact;
    private String address;
    private String city;
    private String zipCode;
    private String country;
    private Float rating;


    public Library() {
    }

    public Library(String name, Long id, String contact, String address, String city, String zipCode, String country, Float rating) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.rating = rating;
    }

    public Library(String name, String contact, String city, String address, String zipCode, String country, Float rating) {
        this.name = name;
        this.contact = contact;
        this.city = city;
        this.address = address;
        this.zipCode = zipCode;
        this.country = country;
        this.rating = rating;
    }
}
