//summary projection

package edu.odu.cs.cs350.pne;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SummaryProjectionReport {
    public static double calcPercentElapsed(LocalDate startDate, LocalDate endDate, LocalDate snapDate) {
        //startDate is the beginning of the enrollment period
        //endDate is the end of the enrollment period
        //snapDate is the day of the snapshot

        // long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        // long elapsedDays = ChronoUnit.DAYS.between(startDate, snapDate);
        // double percentElapsed = (double) elapsedDays / (double) totalDays * 100; //placeholder
        // return percentElapsed;
        BigDecimal totalDays = BigDecimal.valueOf(ChronoUnit.DAYS.between(startDate, endDate));
        BigDecimal elapsedDays = BigDecimal.valueOf(ChronoUnit.DAYS.between(startDate, snapDate));
        BigDecimal percentElapsed = elapsedDays.divide(totalDays, 10, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
        percentElapsed = percentElapsed.setScale(2, RoundingMode.HALF_UP); // Round to 2 decimal places
        return percentElapsed.doubleValue();
        
    }

}
