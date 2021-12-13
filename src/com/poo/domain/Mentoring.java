package com.poo.domain;

import java.time.LocalDate;

public class Mentoring extends Content{
    
    LocalDate date;
    
    public Mentoring() { }

    public Mentoring(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring [date=" + date + ", description=" + description + ", title=" + title + "]";
    }

    @Override
    public double calculateXP() {
        // TODO Auto-generated method stub
        return 0;
    }  
}
