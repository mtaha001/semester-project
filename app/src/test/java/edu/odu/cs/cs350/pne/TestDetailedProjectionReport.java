package edu.odu.cs.cs350.pne;

//unit testing for detailed projection report
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    @BeforeEach 
    public void setUp() throws Exception{
        DetailedReport1 = new DetailedProjectionReport();
        outPath = "C:/tnguy039/OutPut";
    }


    @Test
    public void testDetailedProjectionReportDefaultConstructor()
    {
        assertEquals(DetailedReport1.getFilePath(), "");

    }
  
    @Test
    public void testSetFilePath()
    {
        assertEquals(DetailedReport1.getFilePath(),"");
        DetailedReport1.setFilePath(outPath);
        assertEquals(DetailedReport1.getFilePath(),"C:/tnguy039/OutPut");
    }

    @Test
    public void testCreateWorkbook() throws Exception {
        String filePath = "C:/path/to/test_workbook.xlsx";
        Path path = Paths.get(filePath);
        
        // Create any necessary directories
        Files.createDirectories(path.getParent());
        
        // Create the file
        Files.createFile(path);
        
        // Create a new Excel workbook
        Workbook workbook = new XSSFWorkbook();
        
        // Write the workbook to the file
        FileOutputStream outputStream = new FileOutputStream(new File(filePath));
        workbook.write(outputStream);
        outputStream.close();
        
        // Check that the file was created and is not empty
        File file = new File(filePath);
        assertTrue(file.exists());
        assertTrue(file.length() > 0);
        
        // Delete the file
        file.delete();

        // Check the workbook created was save to path
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            assertTrue(new File(filePath).exists());
        }

    }

    
    

   


    
}
