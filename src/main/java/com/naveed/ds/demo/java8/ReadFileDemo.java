package com.naveed.ds.demo.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class ReadFileDemo {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("c:/TEMP", "data.txt");
        Files.lines(filePath).forEach(System.out::println);

        List<String> filteredLines = Files.lines(filePath)
                .filter(s -> s.contains("password"))
                .collect(Collectors.toList());

        filteredLines.forEach(System.out::println);
    }

}
