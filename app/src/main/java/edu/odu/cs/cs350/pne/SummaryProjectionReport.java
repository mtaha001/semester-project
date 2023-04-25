package edu.odu.cs.cs350.pne;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
*  Represents a summary projection report for the semester
* which a projection is desired. It contains a tree set of
* CourseProjections.
 * Uses some semesters for
 * historical data, while one Semester will be used as the desired
 * projection Semester.
*/
public class SummaryProjectionReport {

    private TreeSet<CourseProjection> projections;
	
   /**
    * Default constructor
    * Creates a new SummaryProjectionReport object with an empty tree set of CourseProjections.
    */
    public SummaryProjectionReport() {
        projections = new TreeSet<>();
    }
    
   /**
    * Adds a CourseProjection to the tree set of projections.
    * @param courseProjection The CourseProjection to add.
    */
    public void addCourseProjection(CourseProjection courseProjection) {
        projections.add(courseProjection);
    }
    
   /**
    * Returns a list of all CourseProjections in the tree set.
    * @return A list of all CourseProjections in the tree set.
    */
    public List<CourseProjection> getProjections() {
        return new ArrayList<>(projections);
    }


  /**
   * Calculates the percentage of time elapsed between a start date and an end date, based on a
   * current date.
   * @param startDate The start date of the enrollment period.
   * @param endDate The end date of the enrollment period.
   * @param snapDate The current date.
   * @return The percentage of time elapsed between the start and end dates, as a double.
   */
    public static double calcPercentElapsed(String startDate, String endDate, String snapDate) { 

        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        LocalDate current = LocalDate.parse(snapDate);
        BigDecimal totalDays = BigDecimal.valueOf(ChronoUnit.DAYS.between(start, end));
        BigDecimal elapsedDays = BigDecimal.valueOf(ChronoUnit.DAYS.between(start, current));
        BigDecimal percentElapsed = elapsedDays.divide(totalDays, 10, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
        
        // If number is 0 or negative, return 0. If number is greater than 100, return 100.
        if (percentElapsed.compareTo(BigDecimal.ZERO) <= 0) {
            return 0;
        } else if (percentElapsed.compareTo(BigDecimal.valueOf(100)) > 0) {
            return 100;
        } else {
            return percentElapsed.setScale(2, RoundingMode.HALF_UP).intValue();
        }        
        
    }

   /**
    *Displays the CourseProjections in the tree set, along with the percentage of time elapsed
    *since the start of the enrollment period.
    * @param startDate The start date of the enrollment period.
    * @param endDate The end date of the enrollment period.
    * @param currentDate The current date.
    */
    public void displayProjections(String startDate, String endDate, String currentDate) {
        double percentElapsed = calcPercentElapsed(startDate, endDate, currentDate);
    
        System.out.printf("Enrollment period has elapsed %.2f%%%n", percentElapsed);
        System.out.printf("%-8s %-6s %s %s %s%n", "", "Course", "Enrollment", "Projected", "Cap");
    
        for (CourseProjection projection : projections) {
            System.out.println(projection);
        }
    }
	

    

}
