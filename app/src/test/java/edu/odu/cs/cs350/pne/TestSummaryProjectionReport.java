package edu.odu.cs.cs350.pne;

//unit testing for summary projection report
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestSummaryProjectionReport {

    
    @Test
    public void testCalcPercentElapsed() {
        // Set up test data
    String startDate = "2022-01-01";
    String endDate = "2022-01-31";
    String snapDate = "2022-01-15";
    double expectedPercentElapsed = 46.0;

    // Call the method under test
    double actualPercentElapsed = SummaryProjectionReport.calcPercentElapsed(startDate, endDate, snapDate);

    // Assert the result
    assertEquals(expectedPercentElapsed, actualPercentElapsed, 0.01);
    }
}


    





    
    

   


    

