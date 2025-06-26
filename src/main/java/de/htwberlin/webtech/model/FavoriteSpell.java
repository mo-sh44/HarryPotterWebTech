package de.htwberlin.webtech.model;

import jakarta.persistence.*;

@Entity
public class FavoriteSpell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Column(name = "user_id")
    private String userId;

    public FavoriteSpell() {}

    public FavoriteSpell(String name, String description, String userId) {
        this.name = name;
        this.description = description;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
