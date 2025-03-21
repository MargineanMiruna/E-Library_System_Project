package app.e_library.repository;

import app.e_library.domain.Customer;
import app.e_library.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByCustomer(Customer customer);
}
