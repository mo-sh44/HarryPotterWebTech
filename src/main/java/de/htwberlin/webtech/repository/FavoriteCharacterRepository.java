package de.htwberlin.webtech.repository;

import de.htwberlin.webtech.model.FavoriteCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteCharacterRepository extends JpaRepository<FavoriteCharacter, Long> {

    List<FavoriteCharacter> findByUserId(String userId);
}
