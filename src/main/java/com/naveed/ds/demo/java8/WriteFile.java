package com.naveed.ds.demo.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class WriteFile {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("c:/TEMP/output.txt");
        String content = "Hello World !!";
        Files.write(path, content.getBytes());
    }
}
