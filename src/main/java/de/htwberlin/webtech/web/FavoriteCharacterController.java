package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.FavoriteCharacter;
import de.htwberlin.webtech.web.service.FavoriteCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "http://localhost:5174",
        "http://localhost:5175",
        "https://harrypotter-frontend.onrender.com"
})
public class FavoriteCharacterController {

    private final FavoriteCharacterService service;

    @Autowired
    public FavoriteCharacterController(FavoriteCharacterService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FavoriteCharacter>> getFavoritesByUser(@RequestHeader("user-id") String userId) {
        return ResponseEntity.ok(service.findByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<FavoriteCharacter> saveFavorite(@RequestBody FavoriteCharacter character) {
        if (character.getUserId() == null || character.getUserId().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.save(character));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id, @RequestHeader("user-id") String userId) {
        Optional<FavoriteCharacter> favOpt = service.findById(id);
        if (favOpt.isPresent()) {
            FavoriteCharacter fav = favOpt.get();
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