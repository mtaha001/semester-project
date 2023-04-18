package edu.odu.cs.cs350.pne;

//unit testing for summary projection report
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class TestSummaryProjectionReport {

    @Test
    public void testEmptyProjections() {
        SummaryProjectionReport report = new SummaryProjectionReport();
        List<CourseProjection> projections = report.getProjections();
        assertTrue(projections.isEmpty());
    }
    
    @Test
    public void testAddCourseProjection() {
        SummaryProjectionReport report = new SummaryProjectionReport();
        CourseProjection courseProjection1 = new CourseProjection("CS 350", 10, 5, 20);
        report.addCourseProjection(courseProjection1);
        
        List<CourseProjection> projections = report.getProjections();
        assertEquals(1, projections.size());
        assertEquals("CS 350", projections.get(0).getName());
        assertEquals(10, projections.get(0).getCurrentEnrollment());
        assertEquals(5, projections.get(0).getProjectedEnrollment());
        assertEquals(20, projections.get(0).getTotalCap());
    }

    @Test
    public void testCalcPercentElapsed() {
    
    // Test with start date before snap date and end date after snap date
    String startDate = "2022-01-01";
    String endDate = "2022-12-31";
    String snapDate = "2022-06-30";
    double percentElapsed = SummaryProjectionReport.calcPercentElapsed(startDate, endDate, snapDate);
    assertEquals(49.0, percentElapsed, 0.01);

    // Test with snap date before start date
    startDate = "2022-01-01";
    endDate = "2022-12-31";
    snapDate = "2021-12-31";
    percentElapsed = SummaryProjectionReport.calcPercentElapsed(startDate, endDate, snapDate);
    assertEquals(0.00, percentElapsed, 0.01);

    // Test with snap date after end date
    startDate = "2022-01-01";
    endDate = "2022-12-31";
    snapDate = "2023-01-01";
    percentElapsed = SummaryProjectionReport.calcPercentElapsed(startDate, endDate, snapDate);
    assertEquals(100.00, percentElapsed, 0.01);

    }
}


    





    
    

   


    

