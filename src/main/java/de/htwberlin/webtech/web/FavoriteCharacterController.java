package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.FavoriteCharacter;
import de.htwberlin.webtech.repository.FavoriteCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "http://localhost:5174",
        "http://localhost:5175",
        "https://harrypotter-frontend.onrender.com"
})
public class FavoriteCharacterController {

    @Autowired
    private FavoriteCharacterRepository repository;

    @GetMapping
    public ResponseEntity<List<FavoriteCharacter>> getAllFavorites() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<FavoriteCharacter> saveFavorite(@RequestBody FavoriteCharacter character) {
        return ResponseEntity.ok(repository.save(character));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FavoriteCharacter> getFavoriteById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
