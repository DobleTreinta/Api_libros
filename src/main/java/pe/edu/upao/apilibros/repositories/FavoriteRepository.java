package pe.edu.upao.apilibros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.apilibros.models.Book;
import pe.edu.upao.apilibros.models.FavoriteBook;
import pe.edu.upao.apilibros.models.User;

import java.util.List;
import java.util.Optional;

public interface FavoriteRepository extends JpaRepository<FavoriteBook, Long> {
    List<FavoriteBook> findAll();
    Optional<FavoriteBook> findById(Long id);
    List<FavoriteBook> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author);
    Book save( Book book);


    List<FavoriteBook> findAllByUser(User user);

    FavoriteBook save(Long bookId, Long userId);
}