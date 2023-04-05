package edu.odu.cs;

import edu.odu.cs.cs350.pne.Semester;

public class Driver {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Missing arguments");
            return;
        }
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
        boolean flag = true;

        return flag;
    }
}
