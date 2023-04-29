package pe.edu.upao.apilibros.services;

import pe.edu.upao.apilibros.models.Book;
import pe.edu.upao.apilibros.models.FavoriteBook;
import pe.edu.upao.apilibros.models.User;
import pe.edu.upao.apilibros.repositories.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteBookService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public FavoriteBook saveFavorite(FavoriteBook favoriteBook) {
        return favoriteRepository.save(favoriteBook);
    }

    @Override
    public void deleteFavoriteById(Long id) {
        favoriteRepository.deleteById(id);

    }

    @Override
    public List<FavoriteBook> getAllFavoritesByUser(User user) {
        return favoriteRepository.findAllByUser(user);
    }

    @Override
    public FavoriteBook addFavoriteBook(Long bookId, Long userId) {
        return favoriteRepository.save(bookId, userId);
    }

    @Override
    public List<Book> getFavoriteBooksByUserId(Long userId) {
        return (List<Book>) favoriteRepository.getReferenceById(userId);
    }


}