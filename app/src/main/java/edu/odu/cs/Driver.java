package edu.odu.cs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import edu.odu.cs.cs350.pne.Semester;

public class Driver {
    public static void main(String[] args) throws IOException {

        // Don't continue if there aren't enough arguments provided
        if (minParametersMet(args) == false)
            return;

        ArrayList<Semester> historicalSemesterList = new ArrayList<Semester>();

        // Loop through the provided parameters and initialize the correct
        // variable for each argument
        for (int i = 0; i < args.length; i++) {
            if (isSemesterDirectory(args[i].toString()) == true) {
                Semester s = new Semester(args[i].toString());

                if (isHistoricalSemester(args[i].toString()) == true) {
                    historicalSemesterList.add(s);
                }
            }

            else {
                String DPRPath = args[i].toString();
            }

            String optionalDate = args[i].toString();
        }

    }

    /**
     * Validates that the minimum number of required parameters are met.
     * 
     * @param args the array of parameters that were passed with exec
     * @return true if enough parameters were provided to successfully run the
     *         program
     * @return false otherwise
     **/
    private static boolean minParametersMet(String[] args) {
        if (args.length < 3) {
            System.err.println("Missing arguments. Please provide the following: \n" +
                    "1. One or more semester directory locations of historical data.\n" +
                    "2. A single semester directory location.\n" +
                    "3. A path for the DPR to be written.\n" +
                    "4. (Optional): A date as YYYY-MM-DD. \n");
            return false;
        }

        else {
            return true;
        }
    }

    /**
     * Computes whether or not a command argument is
     * a Semester directory.
     * 
     * @return true if the argument is a Semester Directory
     * @return false if the argument is not a Semester Directory
     **/
    static boolean isSemesterDirectory(String s) {
        return s.substring(s.length() + 1, s.length() - 2).contains("10") ||
                s.substring(s.length() + 1, s.length() - 2).contains("20") ||
                s.substring(s.length() + 1, s.length() - 2).contains("30");
    }

    /**
     * Computes whether or not a command argument is
     * a part of the Historical directory list, or
     * if it is the directory location that
     * indicates the enrollment data for the semester which a
     * projection is desired.
     * 
     * @return true if the argument is part of Historical directory list
     * @return false if the argument is not
     **/
    static boolean isHistoricalSemester(String argument) {
        return true;
    }
}
