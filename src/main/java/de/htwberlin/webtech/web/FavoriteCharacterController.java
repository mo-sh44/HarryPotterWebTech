package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.FavoriteCharacter;
import de.htwberlin.webtech.web.service.FavoriteCharacterService;
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

    private final FavoriteCharacterService service;

    @Autowired
    public FavoriteCharacterController(FavoriteCharacterService service ) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FavoriteCharacter>> getAllFavorites() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<FavoriteCharacter> saveFavorite(@RequestBody FavoriteCharacter character) {
        return ResponseEntity.ok(service.save(character));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FavoriteCharacter> getFavoriteById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

