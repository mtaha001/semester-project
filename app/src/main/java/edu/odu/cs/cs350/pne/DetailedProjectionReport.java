package edu.odu.cs.cs350.pne;


import java.io.Console;
import java.io.IOException;
import java.io.*;
import java.io.FileOutputStream;



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

    
    public static void main(String[] args) {

        // Check if the user has provided the file location
        if (args.length == 0) {
            System.out.println("Please provide the file location.");
            return;
        }

        // Get the file location from the command line argument
        String fileLocation = args[0];
        
    }
    



    




}
