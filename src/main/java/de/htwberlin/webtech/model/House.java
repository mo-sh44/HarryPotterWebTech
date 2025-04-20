package de.htwberlin.webtech.model;

import java.util.List;

public class House {
    private String id;
    private String name;
    private String founder;
    private String mascot;
    private List<String> values;
    private List<String> colors;
    private String ghost;
    private String commonRoom;

    // Constructors
    public House() {
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public String getGhost() {
        return ghost;
    }

    public void setGhost(String ghost) {
        this.ghost = ghost;
    }

    public String getCommonRoom() {
        return commonRoom;
    }

    public void setCommonRoom(String commonRoom) {
        this.commonRoom = commonRoom;
    }
}

