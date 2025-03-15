package app.e_library.controller;

import app.e_library.domain.Customer;
import app.e_library.domain.Review;
import app.e_library.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/review")
public class ReviewController {
    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public void createReview(@RequestBody Review review) {
        reviewService.createReview(review);
    }

    @GetMapping
    public List<Review> getReviews() {
        return reviewService.getReviews();
    }

    @GetMapping("/{id}")
    public Review getReview(@PathVariable Long id) {
        return reviewService.getReview(id);
    }

    @GetMapping("/customer/{customer}")
    public Review getReviewByReviewer(@PathVariable Customer customer) {
        return reviewService.getReview(customer);
    }

    @PostMapping("/{id}")
    public void updateReview(@RequestBody Review review) {
        reviewService.updateReview(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }
}
