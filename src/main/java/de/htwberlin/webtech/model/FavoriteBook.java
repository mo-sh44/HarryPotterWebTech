package de.htwberlin.webtech.model;

import jakarta.persistence.*;

@Entity
public class FavoriteBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String cover;
    private String userId;

    public FavoriteBook() {}

    public FavoriteBook(String title, String cover, String userId) {
        this.title = title;
        this.cover = cover;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCover() {
        return cover;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
