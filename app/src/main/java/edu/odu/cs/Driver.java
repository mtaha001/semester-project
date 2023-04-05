package edu.odu.cs;

import java.util.Arrays;
import edu.odu.cs.cs350.pne.Semester;

public class Driver {
    public static void main(String[] args) {

        validateParameters(args);

        for (int i = 0; i < args.length; i++) {

            if (isSemesterDirectory(args[i].toString()) == true) {

            }

        }
    }

    private static void validateParameters(String[] args) {
        if (args.length < 3) {
            System.err.println("Missing arguments. Please provide the following: \n" +
                    "1. One or more semester directory locations of historical data.\n" +
                    "2. A single semester directory location.\n" +
                    "3. A path for the DPR to be written.\n" +
                    "4. (Optional): A date as YYYY-MM-DD. \n");
            return;
        }
    }

    /*
     * Computes whether or not a command argument is
     * a Semester directory.
     * 
     * @return true if the argument is a Semester Directory
     * 
     * @return false if the argument is not a Semester Directory
     */
    static boolean isSemesterDirectory(String argument) {

        return true;
    }

    /*
     * Computes whether or not a command argument is
     * a part of the Historical directory list, or
     * if it is the directory location that
     * indicates the enrollment data for the semester which a
     * projection is desired.
     * 
     * @return true if the argument is part of Historical directory list
     * 
     * @return false if the argument is not
     */
    boolean isHistoricalSemester() {
        return true;
    }
}
