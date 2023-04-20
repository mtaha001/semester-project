package edu.odu.cs.cs350.pne;

import java.util.List;

public class CourseProjection implements Comparable<CourseProjection> {
    private String name;
    private int currentEnrollment;
    private int projectedEnrollment;
    private int totalCap;
    private List<Offering> offerings;

    public CourseProjection(String name, List<Offering> offerings, int projectedEnrollment) {
        this.name = name;
        this.offerings = offerings;
        this.currentEnrollment = getCurrentEnrollment();
        this.totalCap = getTotalCap();
        this.projectedEnrollment = projectedEnrollment;
    }

    public String getName() {
        return name;
    }

    public int getCurrentEnrollment() {
        int total = 0;
        for (Offering offering : offerings) {
            total += offering.getOVERALLENR();
        }
        return total;
    }

    public void setCurrentEnrollment(int currentEnrollment) {
        this.currentEnrollment = currentEnrollment;
    }

    public int getProjectedEnrollment() {
        return projectedEnrollment;
    }

    public int getTotalCap() {
        int total = 0;
        for (Offering offering : offerings) {
            total += offering.getOVERALLCAP();
        }
        return total;
    }

     public List<Offering> getOfferings() {
        return offerings;
    }

    public void setOfferings(List<Offering> offerings) {
        this.offerings = offerings;
    }

    @Override
    public String toString() {
        String marker = projectedEnrollment > totalCap ? "*" : " ";
        return String.format("%s%-6s %4d %4d %4d", marker, name, currentEnrollment, projectedEnrollment, totalCap);
    }

    
    @Override
    public int compareTo(CourseProjection other) {
        return this.name.compareTo(other.name);
    }
}
