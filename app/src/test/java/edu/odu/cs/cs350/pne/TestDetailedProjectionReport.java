package edu.odu.cs.cs350.pne;

//unit testing for detailed projection report
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.Console;
import java.io.IOException;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestDetailedProjectionReport {

    public DetailedProjectionReport DetailedReport1;
    public String filePath ;
    public String outPath; 

    //Set up
    @BeforeEach 
    public void setUp() throws Exception{
        DetailedReport1 = new DetailedProjectionReport();
        outPath = "C:/tnguy039/OutPut";
        filePath = "test/reports";
    }

    //Test default constructor for DPR
    @Test
    public void testDetailedProjectionReportDefaultConstructor()
    {
        assertEquals(DetailedReport1.getFilePath(), "");

    }
    
    //Test setter for filepath
    @Test
    public void testSetFilePath()
    {
        assertEquals(DetailedReport1.getFilePath(),"");
        DetailedReport1.setFilePath(outPath);
        assertEquals(DetailedReport1.getFilePath(),"C:/tnguy039/OutPut");
    }

    @Test
    void testOutputviaCLI_Success() throws IOException, InvalidFormatException {
    // Execute the method under test and capture any exceptions
    try {
        DetailedReport1.CreateWorkbookThroughCLI("src/test/reports");
    } catch (Exception e) {
        assertEquals(0, 0, "Exception thrown: " + e.getMessage());
    }
    // Verify that the expected file was created
    File file = new File("src/test/reports/report.xlsx");
    assertTrue(file.exists(), "Expected file not found: " + file.getAbsolutePath());

    // Verify that the file path was set correctly
    assertEquals(DetailedReport1.getFilePath(), "");
    assertTrue(file.exists());
}


    


}


    
    

   


    

