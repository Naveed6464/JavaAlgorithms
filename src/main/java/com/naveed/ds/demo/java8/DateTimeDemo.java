package com.naveed.ds.demo.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());                //2013-05-15
        System.out.println(localDate.getDayOfWeek().toString()); //WEDNESDAY
        System.out.println(localDate.getDayOfMonth());           //15
        System.out.println(localDate.getDayOfYear());            //135
        System.out.println(localDate.isLeapYear());              //false
        System.out.println(localDate.plusDays(12).toString());   //2013-05-27

        //LocalTime localTime = LocalTime.now();     //toString() in format 09:57:59.744
        LocalTime localTime = LocalTime.of(12, 20);
        System.out.println(localTime.toString());    //12:20
        System.out.println(localTime.getHour());     //12
        System.out.println(localTime.getMinute());   //20
        System.out.println(localTime.getSecond());   //0
        System.out.println(localTime.MIDNIGHT);      //00:00
        System.out.println(localTime.NOON);          //12:00

        DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
        formatterBuilder.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                .appendLiteral("-").
                appendZoneOrOffsetId();
        DateTimeFormatter formatter = formatterBuilder.toFormatter();
        System.out.println(formatter.format(ZonedDateTime.now()));
    }

}
