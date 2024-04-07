package com.appointment.booking.system.Appointment.booking.system.util;

import org.springframework.data.util.Pair;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Utils {

    static String PATTERN_HOUR = "yyyy-MM-dd HH";
    static String PATTERN_DATE = "yyyy-MM-dd";

    public static Long convertDateToEpoch(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN_HOUR);
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        LocalTime localTime = localDateTime.toLocalTime();
        return localDateTime.toInstant(java.time.OffsetDateTime.now().getOffset()).toEpochMilli();
    }

    public static Pair<String,Integer> convertEpochToDate(long epoch) {
        Instant instant = Instant.ofEpochMilli(epoch);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN_DATE);
        int hours = localDateTime.getHour();
        return Pair.of(localDateTime.format(formatter), hours);
    }

//    public static String fetchHour(String date){
//
//    }

//    public static void main(String args[]){
//        String date = "2022-02-21 01";
//        long epoch = convertDateToEpoch(date);
//        String output = convertEpochToDate(epoch);
//        System.out.println("date : -> "+ date);
//        System.out.println("epoch : -> "+ epoch);
//        System.out.println("output : -> "+ output);
//    }
}
