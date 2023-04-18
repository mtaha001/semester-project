package edu.odu.cs.cs350.pne;

//unit testing for summary projection report
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestSummaryProjectionReport {

    
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


    





    
    

   


    

