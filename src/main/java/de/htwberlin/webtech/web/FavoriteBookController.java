package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.FavoriteBook;
import de.htwberlin.webtech.web.service.FavoriteBookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/favorite-books")
@CrossOrigin(
        origins = {
                "http://localhost:5173",
                "http://localhost:5174",
                "http://localhost:5175",
                "https://harrypotter-frontend.onrender.com"
        },
        allowedHeaders = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.OPTIONS}
)

public class FavoriteBookController {

    private final FavoriteBookService service;

    public FavoriteBookController(FavoriteBookService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FavoriteBook>> getFavoritesByUser(@RequestHeader("user-id") String userId) {
        return ResponseEntity.ok(service.findByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<FavoriteBook> saveFavorite(@RequestBody FavoriteBook book) {
        if (book.getUserId() == null || book.getUserId().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.save(book));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id, @RequestHeader("user-id") String userId) {
        Optional<FavoriteBook> favOpt = service.findById(id);
        if (favOpt.isPresent()) {
            FavoriteBook fav = favOpt.get();
            if (fav.getUserId().equals(userId)) {
                service.delete(id);
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.status(403).build();
            }
        }
        return ResponseEntity.notFound().build();
    }
}
