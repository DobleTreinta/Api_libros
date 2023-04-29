package pe.edu.upao.apilibros.repositories;

import pe.edu.upao.apilibros.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List <Review> findByBookId(Long bookId);
    List <Review> findByUserId(Long userId);




}