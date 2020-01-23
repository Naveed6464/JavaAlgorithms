package com.naveed.ds.demo.java8;

import java.util.function.Predicate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public static int nameCompare(Employee a1, Employee a2) {
        return a1.firstName.compareTo(a2.firstName);
    }

    //All Employees who are male and age more than 21
    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    //All Employees whose age is more than a given age
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }

}
