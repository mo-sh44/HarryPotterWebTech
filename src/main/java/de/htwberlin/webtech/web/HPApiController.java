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
}
