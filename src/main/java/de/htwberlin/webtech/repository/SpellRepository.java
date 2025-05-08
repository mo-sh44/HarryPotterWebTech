package de.htwberlin.webtech.repository;

import de.htwberlin.webtech.model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellRepository extends JpaRepository<Spell, Long> {
}
