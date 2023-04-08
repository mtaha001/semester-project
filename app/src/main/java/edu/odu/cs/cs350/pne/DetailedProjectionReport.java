package edu.odu.cs.cs350.pne;


import java.io.Console;
import java.io.IOException;
import java.io.*;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class DetailedProjectionReport {
    private InputStream fileIn;
    private FileOutputStream fileOut; 
    private String filePath; 
    private String newFilePath;

    // Default Constructor for DPR
    public DetailedProjectionReport()
    {
        this.filePath ="";
    }
    
    

    /**
     * getFilePath()
     * 
     * @return filePath 
     */
    public String getFilePath(){
        return filePath; 
    }

    //Set filepath
    public void setFilePath(String newFilePath){
        this.filePath = newFilePath;
    }
    
    public void CreateWorkbookThroughCLI(String filePath) throws IOException, InvalidFormatException {
        // Create directory if it doesn't exist
        new File(filePath).mkdirs();
    
        // Create output file
        File outputFile = new File(filePath + "/report.xlsx");
        if (outputFile.createNewFile()) {
            // File was created successfully
        } else {
            // File already exists, overwrite it
        }

        //Reads the template file "template.xlsx" and creates a new XSSFWorkbook object from the template file and writes it to the output file
        try (InputStream templateStream = DetailedProjectionReport.class.getResourceAsStream("/template.xlsx");
         OutputStream fileout = new FileOutputStream(outputFile);
         XSSFWorkbook wb = new XSSFWorkbook(templateStream)) {
        wb.write(fileout);
        } catch (IOException e) {
            System.err.println("Error occurred when creating file " + filePath + "/report.xlsx");
        }
    }
    


        

    



    
    

    
    
   
    



    




}


