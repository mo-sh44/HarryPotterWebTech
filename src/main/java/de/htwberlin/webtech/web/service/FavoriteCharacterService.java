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

    public FavoriteCharacterService(FavoriteCharacterRepository repository) {
        this.repository = repository;
    }

    public List<FavoriteCharacter> findAll() {
        return repository.findAll();
    }

    public Optional<FavoriteCharacter> findById(Long id) {
        return repository.findById(id);
    }

    public FavoriteCharacter save(FavoriteCharacter character) {
        return repository.save(character);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

