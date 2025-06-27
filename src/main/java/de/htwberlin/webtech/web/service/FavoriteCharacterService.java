package de.htwberlin.webtech.web.service;

import de.htwberlin.webtech.model.FavoriteCharacter;
import de.htwberlin.webtech.repository.FavoriteCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteCharacterService {

    private final FavoriteCharacterRepository repository;

    @Autowired
    public FavoriteCharacterService(FavoriteCharacterRepository repository) {
        this.repository = repository;
    }

    // ✅ استرجاع المفضلات حسب userId
    public List<FavoriteCharacter> findByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    // ✅ استرجاع حسب ID
    public Optional<FavoriteCharacter> findById(Long id) {
        return repository.findById(id);
    }


    // ✅ حفظ عنصر
    public FavoriteCharacter save(FavoriteCharacter character) {
        if (character.getUserId() == null || character.getUserId().isBlank()) {
            throw new IllegalArgumentException("userId darf nicht leer sein");
        }
        return repository.save(character);
    }

    // ✅ حذف عنصر
    public void delete(Long id) {
        repository.deleteById(id);
    }


    public List<FavoriteCharacter> findAll() {
        return repository.findAll();
    }


}
