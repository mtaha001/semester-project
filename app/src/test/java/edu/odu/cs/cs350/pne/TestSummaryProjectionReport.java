package edu.odu.cs.cs350.pne;

//unit testing for summary projection report
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.Console;
import java.io.IOException;
import java.time.LocalDate;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestSummaryProjectionReport {

    //@Test
    @Test
    public void testCalcPercentElapsed() {
        // Set up test data
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 1, 31);
        LocalDate snapDate = LocalDate.of(2022, 1, 15);
        double expectedPercentElapsed = 50.0;

        // Call the method under test
        double actualPercentElapsed = SummaryProjectionReport.calcPercentElapsed(startDate, endDate, snapDate);

        // Assert the result
        assertEquals(expectedPercentElapsed, actualPercentElapsed, 0.01);
    }
}


    





    
    

   


    

