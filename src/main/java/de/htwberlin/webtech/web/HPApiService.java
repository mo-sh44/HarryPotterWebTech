package de.htwberlin.webtech.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HPApiService {

    private final RestTemplate restTemplate;
    private static final String BASE_URL = "https://hp-api.onrender.com/api";

    public HPApiService() {
        this.restTemplate = new RestTemplate();
    }

    public String getAllCharacters() {
        ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL + "https://hp-api.onrender.com/api/characters", String.class);
        return response.getBody();
    }

    public String getStudents() {
        ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL + "https://hp-api.onrender.com/api/characters/students", String.class);
        return response.getBody();
    }


    public String getSpells() {
        ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL + "https://hp-api.onrender.com/api/spells", String.class);
        return response.getBody();
    }
    public String getHogwartsStaff() {
        String url = "https://hp-api.onrender.com/api/characters/staff";
        return restTemplate.getForObject(url, String.class);
    }

    public String getCharactersByHouse(String house) {
        String url = "https://hp-api.onrender.com/api/characters/house/" + house;
        return restTemplate.getForObject(url, String.class);
    }


}
