package de.htwberlin.webtech.web.service;

import de.htwberlin.webtech.model.FavoriteSpell;
import de.htwberlin.webtech.repository.FavoriteSpellRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteSpellService {

    private final FavoriteSpellRepository repository;

    public FavoriteSpellService(FavoriteSpellRepository repository) {
        this.repository = repository;
    }

    public List<FavoriteSpell> findByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    public Optional<FavoriteSpell> findById(Long id) {
        return repository.findById(id);
    }

    public FavoriteSpell save(FavoriteSpell spell) {
        return repository.save(spell);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
