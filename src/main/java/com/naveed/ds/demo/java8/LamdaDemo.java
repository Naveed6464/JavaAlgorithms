package com.naveed.ds.demo.java8;

import java.util.Arrays;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class LamdaDemo {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Running in Thread");
        }).start();

        Employee[] employees = {new Employee("David"), new Employee("Naveed"),
            new Employee("Alex"), new Employee("Richard")};

        System.out.println("Before Sorting Names: " + Arrays.toString(employees));
        Arrays.sort(employees, Employee::nameCompare);
        System.out.println("After Sorting Names " + Arrays.toString(employees));
    }

}
