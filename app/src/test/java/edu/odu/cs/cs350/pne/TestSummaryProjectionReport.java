package edu.odu.cs.cs350.pne;

//unit testing for summary projection report
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestSummaryProjectionReport {

    
    @Test
    public void testCalcPercentElapsed() {
        // Set up test data
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 1, 31);
        LocalDate snapDate = LocalDate.of(2022, 1, 15);
        double expectedPercentElapsed = 46.67;

        // Call the method under test
        double actualPercentElapsed = SummaryProjectionReport.calcPercentElapsed(startDate, endDate, snapDate);

        // Assert the result
        assertEquals(expectedPercentElapsed, actualPercentElapsed, 0.01);
    }
}


    





    
    

   


    
