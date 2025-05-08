package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.Character;
import de.htwberlin.webtech.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/characters")
public class CharacterRestController {

    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterRestController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping
    public ResponseEntity<List<Character>> fetchCharacters() {
        List<Character> characters = characterRepository.findAll();
        return ResponseEntity.ok(characters);
    }
}
