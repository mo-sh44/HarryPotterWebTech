package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.FavoriteCharacter;
import de.htwberlin.webtech.repository.FavoriteCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin(origins = {
        "http://localhost:5175",
        "http://localhost:5174",
        "https://harrypotter-frontend.onrender.com"
}) // السماح للفرونتند بالدخول سواء محليًا أو من render
public class FavoriteCharacterController {

    @Autowired
    private FavoriteCharacterRepository repository;

    // حفظ الشخصية في قاعدة البيانات
    @PostMapping
    public FavoriteCharacter saveFavorite(@RequestBody FavoriteCharacter character) {
        return repository.save(character);
    }
}
