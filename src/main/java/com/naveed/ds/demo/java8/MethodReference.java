package com.naveed.ds.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class MethodReference {

    public static void main(String[] args) {
        //Class::staticMethodName
        List<Integer> integers = Arrays.asList(1, 12, 433, 5);
        Optional<Integer> max = integers.stream().reduce(Math::max);
        max.ifPresent(value -> System.out.println(value));

        //ClassInstance::instanceMethodName
        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");
        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(sortedAlt);

        //Reference to constructor – Class::new
        List<Integer> integers2 = IntStream
                .range(1, 100).boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        Optional<Integer> max2 = integers2.stream().reduce(Math::max);
        max2.ifPresent(System.out::println);
    }

}
