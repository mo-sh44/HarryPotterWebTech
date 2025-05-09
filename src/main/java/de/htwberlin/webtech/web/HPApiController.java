package de.htwberlin.webtech.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/external")
public class HPApiController {

    private final HPApiService hpApiService;

    public HPApiController(HPApiService hpApiService) {
        this.hpApiService = hpApiService;
    }

    @GetMapping("/characters")
    public ResponseEntity<String> getCharacters() {
        return ResponseEntity.ok(hpApiService.getAllCharacters());
    }

    @GetMapping("/characters/students")
    public ResponseEntity<String> getStudents() {
        return ResponseEntity.ok(hpApiService.getStudents());
    }

    @GetMapping("/characters/staff")
    public ResponseEntity<String> getStaff() {
        return ResponseEntity.ok(hpApiService.getStaff());
    }

    @GetMapping("/characters/hogwarts-staff")
    public ResponseEntity<String> getHogwartsStaff() {
        return ResponseEntity.ok(hpApiService.getHogwartsStaff());
    }

    @GetMapping("/spells")
    public ResponseEntity<String> getSpells() {
        return ResponseEntity.ok(hpApiService.getSpells());
    }

    @GetMapping("/characters/house/{house}")
    public ResponseEntity<String> getCharactersByHouse(@PathVariable String house) {
        return ResponseEntity.ok(hpApiService.getCharactersByHouse(house));
    }

    @GetMapping("/character/{id}")
    public ResponseEntity<String> getCharacterById(@PathVariable String id) {
        return ResponseEntity.ok(hpApiService.getCharacterById(id));
    }
}
