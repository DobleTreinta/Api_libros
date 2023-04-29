package pe.edu.upao.apilibros.services;

import pe.edu.upao.apilibros.models.Review;

import java.util.List;

public interface ReviewService {

    Review createReview(Review review, Long bookId, Long userId );
    List<Review> getReviewsByBookId( Long bookId);
    Review getReviewByBookIdAndUserId(Long bookId, Long userId);
    Review updateReview(Long id, Review review);
    void deleteReview(Long id);

    Review getReviewById(Long id);

    Review addReview(Long bookId, Long userId, Review review);

    Review addReview(Long bookId, Long userId, String title, String comment, Integer rating);

    List<Review> getReviewsByUserId(Long userId);
}