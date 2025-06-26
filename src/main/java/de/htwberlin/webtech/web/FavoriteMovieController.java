package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.FavoriteMovie;
import de.htwberlin.webtech.web.service.FavoriteMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/favorite-movies")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "http://localhost:5174",
        "http://localhost:5175",
        "https://harrypotter-frontend.onrender.com"
})
public class FavoriteMovieController {

    private final FavoriteMovieService service;

    @Autowired
    public FavoriteMovieController(FavoriteMovieService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FavoriteMovie>> getFavoritesByUser(@RequestHeader("user-id") String userId) {
        return ResponseEntity.ok(service.findByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<FavoriteMovie> saveFavorite(@RequestBody FavoriteMovie movie) {
        if (movie.getUserId() == null || movie.getUserId().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.save(movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id, @RequestHeader("user-id") String userId) {
        Optional<FavoriteMovie> favOpt = service.findById(id);
        if (favOpt.isPresent()) {
            FavoriteMovie fav = favOpt.get();
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
