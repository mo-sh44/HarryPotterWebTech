package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.FavoriteSpell;
import de.htwberlin.webtech.web.service.FavoriteSpellService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/favorite-spells")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "http://localhost:5174",
        "http://localhost:5175",
        "https://harrypotter-frontend.onrender.com"
})
public class FavoriteSpellController {

    private final FavoriteSpellService service;

    public FavoriteSpellController(FavoriteSpellService service) {
        this.service = service;
    }

    @GetMapping
    public List<FavoriteSpell> getFavoritesByUser(@RequestHeader("user-id") String userId) {
        return service.findByUserId(userId);
    }

    @PostMapping
    public ResponseEntity<FavoriteSpell> saveFavorite(@RequestBody FavoriteSpell spell) {
        if (spell.getUserId() == null || spell.getUserId().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.save(spell));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id, @RequestHeader("user-id") String userId) {
        Optional<FavoriteSpell> favOpt = service.findById(id);
        if (favOpt.isPresent()) {
            FavoriteSpell fav = favOpt.get();
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
