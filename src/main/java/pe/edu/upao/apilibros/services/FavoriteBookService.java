package pe.edu.upao.apilibros.services;

import pe.edu.upao.apilibros.models.Book;
import pe.edu.upao.apilibros.models.FavoriteBook;
import pe.edu.upao.apilibros.models.User;

import java.util.List;

public interface FavoriteBookService {
    FavoriteBook saveFavorite(FavoriteBook favoriteBook);

    void deleteFavoriteById(Long id);
    List<FavoriteBook> getAllFavoritesByUser(User user);

    FavoriteBook addFavoriteBook(Long bookId, Long userId);

    List<Book> getFavoriteBooksByUserId(Long userId);
}