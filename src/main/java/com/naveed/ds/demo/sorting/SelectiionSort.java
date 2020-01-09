/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.ds.demo.sorting;

import java.util.Arrays;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 7, 2020
 */
public class SelectiionSort {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{53, 22, 66, 3, 36, 93, 27, 18, 40};
        insertionSort(arr, 0, arr.length - 1);
        System.out.println(" Sorted " + Arrays.toString(arr));
    }

    private static void insertionSort(Integer[] arr, int from, int to) {
        Integer d;
        for (int i = from; i <= to; i++) {
            int indexToMove = i;
            for (int j = i + 1; j <= to; j++) {
                if (arr[indexToMove].compareTo(arr[j]) > 0) {
                    indexToMove = j;
                }
            }
            d = arr[i];
            arr[i] = arr[indexToMove];
            arr[indexToMove] = d;
        }
    }
}
