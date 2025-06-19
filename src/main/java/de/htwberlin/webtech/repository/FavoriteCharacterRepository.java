package de.htwberlin.webtech.repository;

import de.htwberlin.webtech.model.FavoriteCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteCharacterRepository extends JpaRepository<FavoriteCharacter, Long> {
    // هنا يمكن لاحقًا إضافة طرق بحث مخصصة إن لزم
}
