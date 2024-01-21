package MachineCoding_HLD.Librar_Management_System.Implementation.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

public class Constants {
    public final static int MAX_BOOKS_CHECKOUT_BY_MEMBER = 5;
    public final static int MAX_DAYS_MEMBER_CAN_KEEP_BOOK = 10;
    public final static long ONE_DAY_MILISECONDS = 86400000;

    public static long convertDayToEpoc(int days){
        LocalDate localDate = LocalDate.ofEpochDay(days);

        // Convert LocalDate to Instant
        Instant instant = localDate.atStartOfDay().toInstant(ZoneOffset.UTC);

        // Get Epoch time in milliseconds
        long epochTimeMillis = instant.toEpochMilli();

        System.out.println("Days: " + days);
        System.out.println("Epoch time in milliseconds: " + epochTimeMillis);
        return epochTimeMillis;
    }
}
