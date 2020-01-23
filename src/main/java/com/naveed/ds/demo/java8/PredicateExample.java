package com.naveed.ds.demo.java8;

import static com.naveed.ds.demo.java8.Employee.isAdultFemale;
import static com.naveed.ds.demo.java8.Employee.isAdultMale;
import static com.naveed.ds.demo.java8.Employee.isAgeMoreThan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class PredicateExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 23, "M", "Rick", "Beethovan"));
        employees.add(new Employee(2, 13, "F", "Martina", "Hengis"));
        employees.add(new Employee(3, 43, "M", "Ricky", "Martin"));
        employees.add(new Employee(4, 26, "M", "Jon", "Lowman"));
        employees.add(new Employee(5, 19, "F", "Cristine", "Maria"));
        employees.add(new Employee(6, 15, "M", "David", "Feezor"));
        employees.add(new Employee(7, 68, "F", "Melissa", "Roy"));
        employees.add(new Employee(8, 79, "M", "Alex", "Gussin"));
        employees.add(new Employee(9, 15, "F", "Neetu", "Singh"));
        employees.add(new Employee(10, 45, "M", "Naveen", "Jain"));

        System.out.println(filterEmployees(employees, isAdultMale()));

        System.out.println(filterEmployees(employees, isAdultFemale()));

        System.out.println(filterEmployees(employees, isAgeMoreThan(35)));

        //Employees other than above collection of "isAgeMoreThan(35)" 
        //can be get using negate()
        System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter(predicate)
                .collect(Collectors.<Employee>toList());
    }

}
