package edu.odu.cs.cs350.pne;

//unit testing for summary projection report
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;



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
        List<Offering> offerings = new ArrayList<>();
        List<Section> sections = new ArrayList<>();
        Section section1 = new Section();
        section1.setOVERALLCAP(20);
        section1.setOVERALLENR(50);
        Section section2 = new Section();
        section2.setOVERALLCAP(30);
        section2.setOVERALLENR(50);
        sections.add(section1);
        sections.add(section2);
        Offering offering1 = new Offering("CS 350", sections);
        Offering offering2 = new Offering("CS 350", sections);
        offerings.add(offering1);
        offerings.add(offering2);
        CourseProjection courseProjection1 = new CourseProjection("CS 350", offerings, 5);
        report.addCourseProjection(courseProjection1);
        List<CourseProjection> projections = report.getProjections();
        assertEquals(1, projections.size());
        assertEquals("CS 350", projections.get(0).getName());
        assertEquals(200, projections.get(0).getCurrentEnrollment());
        assertEquals(5, projections.get(0).getProjectedEnrollment());
        assertEquals(100, projections.get(0).getTotalCap());
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


    





    
    

   


    

