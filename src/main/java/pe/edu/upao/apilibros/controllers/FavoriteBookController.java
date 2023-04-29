package pe.edu.upao.apilibros.controllers;

import pe.edu.upao.apilibros.models.Book;
import pe.edu.upao.apilibros.models.FavoriteBook;
import pe.edu.upao.apilibros.services.FavoriteBookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteBookController {

    private final FavoriteBookService favoriteBookService;
    public FavoriteBookController(FavoriteBookService favoriteBookService) {
        this.favoriteBookService = favoriteBookService;
    }

    @PostMapping
    public ResponseEntity<FavoriteBook> addFavoriteBook(@RequestParam Long
                                                                bookId, @RequestParam Long userId) {
        FavoriteBook newFavoriteBook =
                favoriteBookService.addFavoriteBook(bookId, userId);
        return ResponseEntity.ok(newFavoriteBook);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Book>>
    getFavoriteBooksByUserId(@PathVariable Long userId) {
        List<Book> favoriteBooks =
                favoriteBookService.getFavoriteBooksByUserId(userId);
        return ResponseEntity.ok(favoriteBooks);
    }

}