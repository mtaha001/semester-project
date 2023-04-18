package edu.odu.cs.cs350.pne;

public class CourseProjection {
    private String name;
    private int currentEnrollment;
    private int projectedEnrollment;
    private int totalCap;

    public CourseProjection(String name, int currentEnrollment, int projectedEnrollment, int totalCap) {
        this.name = name;
        this.currentEnrollment = currentEnrollment;
        this.projectedEnrollment = projectedEnrollment;
        this.totalCap = totalCap;
    }

    public String getName() {
        return name;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    public void setCurrentEnrollment(int currentEnrollment) {
        this.currentEnrollment = currentEnrollment;
    }

    public int getProjectedEnrollment() {
        return projectedEnrollment;
    }

    public int getTotalCap() {
        return totalCap;
    }

    @Override
    public String toString() {
        String marker = projectedEnrollment > totalCap ? "*" : " ";
        return String.format("%s%-6s %4d %4d %4d", marker, name, currentEnrollment, projectedEnrollment, totalCap);
    }
}
