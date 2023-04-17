package edu.odu.cs.cs350.pne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws IOException {

        // Don't continue if there aren't enough arguments provided
        if (minParametersMet(args) == false)
            return;

        //Determine if the optional Date was given as a parameter
        boolean dateWasGiven = (args[args.length - 1]).contains("/") || args[args.length - 1].contains("\\");

        ArrayList<Semester> historicalSemesterList = new ArrayList<Semester>();

        // Loop through the provided parameters and initialize the correct
        // variable for each argument
        for (int i = 0; i < args.length; i++) {
            if (isSemesterDirectory(args[i].toString()) == true) {
                Semester s = new Semester(args[i].toString());

                //If there is a date in args, the historical semester directories are any 
                //args[] element that comes before the DPR path and the date
                if (dateWasGiven == true) {
                    if(i < args.length - 2)
                        historicalSemesterList.add(s);
                }

                //if there is no date, the historical directories are any
                //args[] element that comes before the DPR path
                else{
                    if(i < args.length - 1)
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
}

