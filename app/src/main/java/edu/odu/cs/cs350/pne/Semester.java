/*
 * Semester class, as written in the UML diagram
 * A semester has multiple Snapshots and multiple Offerings.
 * 
 * In the SummaryProjectionReport class, some Semesters are used for
 * historical data, while one Semester will be used as the desired
 * projection Semester.
 */
package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class Semester {

    private String directoryLocation;
    private String code;
    private int year; // Academic year
    private String season; // Fall, Spring, or Summer
    private String preRegistrationDate;
    private String addDeadlineDate;
    private ArrayList<Snapshot> snapshots;
    private ArrayList<Offering> offerings;
    private List<File> csvFiles;
    private File dates;


    /*
     * Construct a Semester object
     * 
     * @param directoryLoc - String representing the directory
     *                     containing the semester's data
     * @throws IOException
     * @post condition - Semester object is created and has a directoryLocation,
     *       a semester code, year, season, List of Snapshots, preReg date,
     *       addDeadline date,
     *       and a List of Offerings.
     */
    public Semester(String directoryLoc) throws IOException {

        directoryLocation = directoryLoc;

        // Convert the directory string to a valid path string-----------------
        Path path = Paths.get(directoryLocation);
        directoryLocation = path.toString();
        System.out.println(directoryLocation);

        // Define semester's code as it's folder name--------------------------
        code = path.getFileName().toString();

        // Define semester's year from it's code-------------------------------
        year = Integer.parseInt(code.substring(0, 4));

        // Define semester's season--------------------------------------------
        String seasonID;
        seasonID = code.substring(4, 6);
        switch (seasonID) {
            case "10":
                season = "Fall";
                break;
            case "20":
                season = "Spring";
                break;
            case "30":
                season = "Summer";
                break;
        }


        //Define semesters preRegistration Date using it's dates.txt-------------
        //Create a File object representing the dates.txt file
        File file = new File(directoryLocation, "dates.txt");

        // Create a FileReader object to read the file
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Read both lines of dates.txt file
        String line;
        line = bufferedReader.readLine();
        preRegistrationDate = line; // read pre-registration date
        // line = bufferedReader.readLine();
        bufferedReader.close();

        if (!file.exists()) {
            throw new IOException("Missing dates.txt in semester code.");
        }

        //Define Semester's array of Snapshots ----------------------------------
        ArrayList<Snapshot> snapshots = new ArrayList<Snapshot>();
        List<File> csvFileList = fetchFiles();
        for(File csvFile : csvFileList){
            Snapshot snapshot = new Snapshot(csvFile);
            snapshots.add(snapshot);
        }
   
    }


    /**
     * Fetch all relevant csv files and the "dates.txt" file
     * from the semester's directory.
     * The directory is a system path.
     * Each csv file is put into the csvFiles list.
     * If the file doesn't exist, or any other issue is encountered,
     * an IOException is thrown.
     *
     * @return List of fetched csv files
     * @throws IOException
     */
    public List<File> fetchFiles() throws IOException {
        ArrayList<File> csvFiles = new ArrayList<File>();

        // Find the dates file first to set the pre-registration and add deadline dates
        try (Stream<Path> files = Files.walk(Paths.get(this.directoryLocation))) {
            files.forEach(filePath -> {
                if (Files.isRegularFile(filePath) && filePath.toString().endsWith(".csv")) {
                    csvFiles.add(filePath.toFile());
                } else if (Files.isRegularFile(filePath) && filePath.toString().endsWith("dates.txt")) {
                    this.dates = filePath.toFile();
                    try {
                        setDates(this.dates);
                    } catch (IOException e) {
                        throw new RuntimeException("Error setting dates from file: " + e.getMessage());
                    }
                }
            });
        }

        // If no CSV files were found, throw an IOException
        if (csvFiles.isEmpty()) {
            throw new IOException("No CSV files found in semester directory.");
        }

        return csvFiles;
    }


    /**setDates() Sets the pre-registration and add deadline dates based on 
     * the data found in the "dates.txt" file
     * @throws IOException 
     * @param file a dates.txt file from a semester directory**/
    public void setDates(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
    
        preRegistrationDate = bufferedReader.readLine();
        addDeadlineDate = bufferedReader.readLine();
    
        bufferedReader.close();
    }
    
    
    /**
     * getCode()
     * 
     * @return the Semester's code
     */
    public String getCode() {
        return code;
    }

    /**
     * getDirLoc()
     * 
     * @return the directory of the semester's data (same as what was input
     *         to command-line)
     *         This may not be utilized.
     */
    public String getDirLoc() {
        return directoryLocation;
    }

    /**
     * getYear()
     * 
     * @return the Semester's year
     */
    public int getYear() {
        return year;
    }

    /**
     * getSeason()
     * 
     * @return the Semester's season (Fall, Spring, or Summer)
     */
    public String getSeason() {
        return season;
    }

    /**
     * getPreRegDate()
     * 
     * @return pre registration date
     */
    public String getPreRegDate() {
        return preRegistrationDate;
    }

    /**
     * getAddDeadLineDate()
     * 
     * @return add deadline date
     */
    public String getAddDeadlineDate(){
        return addDeadlineDate;
    }

    /**
     * Returns the list of Snapshot objects stored in this object.
     * @return an ArrayList containing the Snapshot objects stored in this object
     */
    public ArrayList<Snapshot> getSnapshots() {
        return snapshots;
    }

    /**
    * Sets the list of Snapshot objects stored in this object to the specified ArrayList of Snapshot objects.
    * @param snapshots the ArrayList of Snapshot objects to be set as the new list of snapshots for this object
    */
    public void setSnapshots(ArrayList<Snapshot> snapshots) {
        this.snapshots = snapshots;
    }

}


