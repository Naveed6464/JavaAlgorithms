package com.naveed.ds.demo.java8;

import java.util.StringJoiner;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class StringUtil {

    public static void main(String[] args) {
        String joinedString = String.join(", ", "How", "To", "Do", "In", "Java");
        System.out.println(joinedString);

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("How")
                .add("To")
                .add("Do")
                .add("In")
                .add("Java");
        
        System.out.println(" " + joiner.toString());
    }

}
