package app.e_library.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Libraries")
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
    @JsonProperty("name")
    private String name;
    @JsonProperty("contact")
    private String contact;
    @JsonProperty("address")
    private String address;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("rating")
    private Float rating;

    public Library() {
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

    public Library(Long id, String name, String contact, String address, String city, String zipCode, String country, Float rating) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.rating = rating;
    }
}
