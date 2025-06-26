package de.htwberlin.webtech.repository;

import de.htwberlin.webtech.model.FavoriteSpell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteSpellRepository extends JpaRepository<FavoriteSpell, Long> {
    List<FavoriteSpell> findByUserId(String userId);
}
