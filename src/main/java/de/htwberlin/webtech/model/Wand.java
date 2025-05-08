package de.htwberlin.webtech.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Wand {
    private String wood;
    private String core;
    private Double length;

    public Wand() {
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}
