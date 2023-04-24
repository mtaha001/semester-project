package edu.odu.cs.cs350.pne;

import java.util.List;

/**
 * Represents a projected enrollment for a single course, including its name, current enrollment, projected enrollment,
 * total capacity, and a list of its offerings.
 */
public class CourseProjection implements Comparable<CourseProjection> {
    private String name;
    private int currentEnrollment;
    private int projectedEnrollment;
    private int totalCap;
    private List<Offering> offerings;

    /**
     * Constructs a CourseProjection object with the given name, list of offerings, and projected enrollment.
     * 
     * @param name                The name of the course.
     * @param offerings           The list of offerings for the course.
     * @param projectedEnrollment The projected enrollment of the course.
     */
    public CourseProjection(String name, List<Offering> offerings, int projectedEnrollment) {
        this.name = name;
        this.offerings = offerings;
        this.currentEnrollment = getCurrentEnrollment();
        this.totalCap = getTotalCap();
        this.projectedEnrollment = projectedEnrollment;
    }

    /**
     * Returns the name of the course.
     * 
     * @return The name of the course.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the current enrollment of the course, calculated as the sum of the enrollment of each offering.
     * 
     * @return The current enrollment of the course.
     */
    public int getCurrentEnrollment() {
        int total = 0;
        for (Offering offering : offerings) {
            total += offering.getOVERALLENR();
        }
        return total;
    }

    /**
     * Sets the current enrollment of the course to the given value.
     * 
     * @param currentEnrollment The new current enrollment of the course.
     */
    public void setCurrentEnrollment(int currentEnrollment) {
        this.currentEnrollment = currentEnrollment;
    }

    /**
     * Returns the projected enrollment of the course.
     * 
     * @return The projected enrollment of the course.
     */
    public int getProjectedEnrollment() {
        return projectedEnrollment;
    }

    /**
     * Returns the total capacity of the course, calculated as the sum of the capacity of each offering.
     * 
     * @return The total capacity of the course.
     */
    public int getTotalCap() {
        int total = 0;
        for (Offering offering : offerings) {
            total += offering.getOVERALLCAP();
        }
        return total;
    }

    /**
     * Returns the list of offerings for the course.
     * 
     * @return The list of offerings for the course.
     */
    public List<Offering> getOfferings() {
        return offerings;
    }

    /**
     * Sets the list of offerings for the course to the given value.
     * 
     * @param offerings The new list of offerings for the course.
     */
    public void setOfferings(List<Offering> offerings) {
        this.offerings = offerings;
    }
    
    /**
     * Returns a string representation of the course projection, including its name, current enrollment, projected enrollment,
     * and total capacity, with an asterisk (*) appended to the beginning if the projected enrollment is greater than the total capacity.
     * 
     * @return A string representation of the course projection.
     */
    @Override
    public String toString() {
        String marker = projectedEnrollment > totalCap ? "*" : " ";
        return String.format("%s%-6s %4d %4d %4d", marker, name, currentEnrollment, projectedEnrollment, totalCap);
    }

    /**
     * Compares this CourseProjection object with the specified CourseProjection object for order based on their names.
     * @param other the CourseProjection object to be compared
     */
    @Override
    public int compareTo(CourseProjection other) {
        return this.name.compareTo(other.name);
    }
}
