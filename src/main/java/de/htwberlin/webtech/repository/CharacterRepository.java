package de.htwberlin.webtech.repository;

import de.htwberlin.webtech.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
