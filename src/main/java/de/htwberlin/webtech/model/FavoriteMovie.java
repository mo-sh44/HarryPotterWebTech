package de.htwberlin.webtech.model;

import jakarta.persistence.*;

@Entity
public class FavoriteMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String poster;
    private String year;

    @Column(name = "user_id")
    private String userId;

    public FavoriteMovie() {}

    public FavoriteMovie(String title, String poster, String year, String userId) {
        this.title = title;
        this.poster = poster;
        this.year = year;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster() {
        return poster;
    }

    public String getYear() {
        return year;
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

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
