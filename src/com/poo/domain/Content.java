package com.poo.domain;

public abstract class Content {
    
    protected static final double DEFAULT_XP = 10d;

    protected String title;
    protected String description;

    public Content() {}

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double calculateXP ();
}
