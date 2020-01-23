package com.naveed.ds.demo.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class DateUtil {

    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();     //Today
        LocalDateTime tomorrow = today.plusDays(1);     //Plus 1 day
        LocalDateTime yesterday = today.minusDays(1);   //Minus 1 day

        System.out.println(today);          //2018-07-14
        System.out.println(tomorrow);       //2018-07-15
        System.out.println(yesterday);      //2018-07-13

        LocalDateTime sameDayNextMonth = today.plusMonths(1);       //2018-08-14
        LocalDateTime sameDayLastMonth = today.minusMonths(1);      //2018-06-14

        LocalDateTime sameDayNextYear = today.plusYears(1);     //2019-07-14
        LocalDateTime sameDayLastYear = today.minusYears(1);    //2017-07-14

//Get Date from LocalDateTime 
//Not recommended. Use when you have no options in legacy code.
        Date currentDatePlusOneDay = Date.from(tomorrow.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println(currentDatePlusOneDay);      //Sun Jul 15 22:25:04 IST 2018
    }

}
