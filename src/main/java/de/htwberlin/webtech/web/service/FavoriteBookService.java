package de.htwberlin.webtech.web.service;

import de.htwberlin.webtech.model.FavoriteBook;
import de.htwberlin.webtech.repository.FavoriteBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteBookService {

    private final FavoriteBookRepository repository;

    public FavoriteBookService(FavoriteBookRepository repository) {
        this.repository = repository;
    }

    public List<FavoriteBook> findByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    public Optional<FavoriteBook> findById(Long id) {
        return repository.findById(id);
    }

    public FavoriteBook save(FavoriteBook book) {
        return repository.save(book);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
