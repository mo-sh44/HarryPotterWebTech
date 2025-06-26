package de.htwberlin.webtech.model;

import jakarta.persistence.*;

@Entity
public class FavoriteCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String house;
    private String image;

    @Column(name = "user_id")
    private String userId;

    public FavoriteCharacter() {}

    public FavoriteCharacter(String name, String house, String image, String userId) {
        this.name = name;
        this.house = house;
        this.image = image;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public String getImage() {
        return image;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
