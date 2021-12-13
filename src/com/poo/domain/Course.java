package com.poo.domain;


public class Course extends Content{

    private int workload;

    public Course() {}

    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    public String getTitle() {
        return title;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP + workload;
    }
}
