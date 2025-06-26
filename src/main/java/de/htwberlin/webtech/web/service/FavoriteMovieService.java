package de.htwberlin.webtech.web.service;

import de.htwberlin.webtech.model.FavoriteMovie;
import de.htwberlin.webtech.repository.FavoriteMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteMovieService {

    private final FavoriteMovieRepository repository;

    @Autowired
    public FavoriteMovieService(FavoriteMovieRepository repository) {
        this.repository = repository;
    }

    public List<FavoriteMovie> findByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    public Optional<FavoriteMovie> findById(Long id) {
        return repository.findById(id);
    }

    public FavoriteMovie save(FavoriteMovie movie) {
        return repository.save(movie);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
