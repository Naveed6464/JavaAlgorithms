package com.naveed.ds.demo.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class ComparatorDemo {

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

        employees.sort(Comparator.comparing(e -> e.getFirstName()));
        //OR you can use below
        employees.sort(Comparator.comparing(Employee::getFirstName));

        System.out.println(employees);

        employees.sort(Comparator.comparing(Employee::getLastName));
        System.out.println(employees);

        Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName);
        employees.sort(groupByComparator);

        System.out.println(employees);
    }

}
