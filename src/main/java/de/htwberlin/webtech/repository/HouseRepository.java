package de.htwberlin.webtech.repository;

import de.htwberlin.webtech.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}
