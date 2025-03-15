package app.e_library.service;

import app.e_library.domain.Customer;
import app.e_library.domain.Review;
import app.e_library.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public void createReview(Review review) {
        reviewRepository.save(review);
    }

    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }

    public Review getReview(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review getReview(Customer customer) {
        Optional<Review> review = reviewRepository.findByCustomer(customer);
        return review.orElse(null);
    }

    public void updateReview(Review review) {
        reviewRepository.save(review);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
