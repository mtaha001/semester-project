//summary projection

package edu.odu.cs.cs350.pne;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SummaryProjectionReport {

    private TreeSet<CourseProjection> projections;
	
    public SummaryProjectionReport() {
        projections = new TreeSet<>();
    }
    
    public void addCourseProjection(CourseProjection courseProjection) {
        projections.add(courseProjection);
    }
    
    public List<CourseProjection> getProjections() {
        return new ArrayList<>(projections);
    }


    /*
     * This method calculate the percentage of time elapsed
     * 
     * @param directoryLoc - Strings represent start date, end date and snap date
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

    public void displayProjections(String startDate, String endDate, String currentDate) {
        double percentElapsed = calcPercentElapsed(startDate, endDate, currentDate);
    
        System.out.printf("Enrollment period has elapsed %.2f%%%n", percentElapsed);
        System.out.printf("%-8s %-6s %s %s %s%n", "", "Course", "Enrollment", "Projected", "Cap");
    
        for (CourseProjection projection : projections) {
            System.out.println(projection);
        }
    }
	

    

}
