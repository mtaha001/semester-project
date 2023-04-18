//summary projection

package edu.odu.cs.cs350.pne;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SummaryProjectionReport {


    /*
     * This method calculate the percentage of time elapsed
     * 
     * @param directoryLoc - Strings represent start date, end date and snap date
     */
    public static double calcPercentElapsed(String startDate, String endDate, String snapDate) { 
        //startDate is the beginning of the enrollment period
        //endDate is the end of the enrollment period
        //snapDate is the day of the snapshot - current
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        LocalDate current = LocalDate.parse(snapDate);
        BigDecimal totalDays = BigDecimal.valueOf(ChronoUnit.DAYS.between(start, end));
        BigDecimal elapsedDays = BigDecimal.valueOf(ChronoUnit.DAYS.between(start, current));
        BigDecimal percentElapsed = elapsedDays.divide(totalDays, 10, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
        
        // If number is 0 or negative, return 0. If number is greater than 100, return 100.
        if (percentElapsed.compareTo(BigDecimal.ZERO) <= 0) {
            return 0;
        } else if (percentElapsed.compareTo(BigDecimal.valueOf(100)) > 0) {
            return 100;
        } else {
            return percentElapsed.setScale(2, RoundingMode.HALF_UP).intValue();
        }        
        
    }

}
