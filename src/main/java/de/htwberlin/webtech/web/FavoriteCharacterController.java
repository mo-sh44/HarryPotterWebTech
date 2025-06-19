package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.FavoriteCharacter;
import de.htwberlin.webtech.repository.FavoriteCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin(origins = "*") // يسمح بالوصول من أي مصدر (مثل Vue.js)
public class FavoriteCharacterController {

    @Autowired
    private FavoriteCharacterRepository repository;

    // 📥 POST: استقبال البيانات من الواجهة الأمامية
    @PostMapping
    public FavoriteCharacter saveFavorite(@RequestBody FavoriteCharacter character) {
        return repository.save(character);
    }
}
