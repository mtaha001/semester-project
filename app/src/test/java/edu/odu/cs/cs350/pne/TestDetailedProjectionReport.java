package edu.odu.cs.cs350.pne;

//unit testing for detailed projection report
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestDetailedProjectionReport {

    public DetailedProjectionReport DetailedReport1;
    public String filePath ;
    public String outPath; 

    @BeforeEach 
    public void setUp() throws Exception{
        DetailedReport1 = new DetailedProjectionReport();
        outPath = "C:/tnguy039/OutPut";
    }


    @Test
    public void TestDetailedProjectionReportDefaultConstructor()
    {
        assertEquals(DetailedReport1.getFilePath(), "");

    }
  
    @Test
    public void TestSetFilePath()
    {
        assertEquals(DetailedReport1.getFilePath(),"");
        DetailedReport1.setFilePath(outPath);
        assertEquals(DetailedReport1.getFilePath(),"C:/tnguy039/OutPut");
    }

    @Test
    void testCreateReportFile() throws IOException {

        // Set up test variables
        String expectedContent = "This is the detailed projection report file.";
        String fileLocation = "test_report.txt";

        // Call the main method of DetailedProjectionReport class
        DetailedProjectionReport.main(new String[]{fileLocation});

        // Assert that the file was created with the expected content
        assertTrue(Files.exists(Paths.get(fileLocation)));
        BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
        String actualContent = reader.readLine();
        reader.close();
        assertEquals(expectedContent, actualContent);

        // Delete the test file
        Files.deleteIfExists(Paths.get(fileLocation));
    }

    



    
}
