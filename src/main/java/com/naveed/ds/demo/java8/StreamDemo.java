package com.naveed.ds.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class StreamDemo {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
//        stream.forEach(p -> System.out.println(p));

        Stream<String> stream2 = Stream.of("A1$B2$C3".split("\\$"));
        stream2.forEach(p -> System.out.println(p));

        List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersList);

        List<String> memberNames = new ArrayList<>(Arrays.asList("Naveed", "Rahman", "Shahul"));
        memberNames.stream().filter((s) -> s.startsWith("N"))
                .forEach(System.out::println);

        memberNames.stream().filter((s) -> s.startsWith("N"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("N"))
                .count();

        String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("R"))
                .findFirst().get();

        List<Integer> ints = IntStream.of(1, 2, 3, 4, 5)
                .boxed().collect(Collectors.toList());
        System.out.println(ints);
    }

}
