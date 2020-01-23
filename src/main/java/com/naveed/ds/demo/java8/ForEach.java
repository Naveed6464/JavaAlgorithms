/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.ds.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
public class ForEach {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Consumer<Integer> action = System.out::println;

        numberList.stream().filter(n -> n % 2 == 0).forEach(action);

        numberList.forEach(System.out::print);
        
        HashMap< String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
        map.entrySet().forEach(entry -> {
            System.out.println(">>>>>>>>>>>>>>>>> " + entry.getKey() + " = " + entry.getValue());            
        });
    }

}
