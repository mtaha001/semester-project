//summary projection

package edu.odu.cs.cs350.pne;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SummaryProjectionReport {
    public static double calcPercentElapsed(LocalDate startDate, LocalDate endDate, LocalDate snapDate) {
        //startDate is the beginning of the enrollment period
        //endDate is the end of the enrollment period
        //snapDate is the day of the snapshot

        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        long elapsedDays = ChronoUnit.DAYS.between(startDate, snapDate);
        double percentElapsed = (double) elapsedDays / (double) totalDays * 100; //placeholder
        return percentElapsed;
    }

}
