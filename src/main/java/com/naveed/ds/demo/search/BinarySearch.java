/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.ds.demo.search;

import java.util.Arrays;
import static java.util.Collections.list;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 21, 2020
 */
public class BinarySearch {

    public static void main(String args[]) {
        int[] list = new int[]{23, 43, 31, 12};
        binarySearch(list, 31);
    }

    public static void binarySearch(int[] input, int number) {
        Arrays.sort(input);
        System.out.printf("Binary Search %d in integer array %s %n", number, Arrays.toString(input));
        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (input[middle] < number) {
                first = middle + 1;
            } else if (input[middle] == number) {
                System.out.printf(number + " found at location %d %n", middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(number + " is not present in the list.\n");
        }

    }
}
