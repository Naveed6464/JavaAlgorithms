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
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{53, 22, 66, 3, 36, 93, 27, 18, 40};
        bubbleSort(arr, 0, arr.length - 1);
        System.out.println(" Sorted " + Arrays.toString(arr));
    }

    private static void bubbleSort(Integer[] arr, int low, int high) {
        for (int i = high; i > low; i--) {
            boolean isSorted = true;
            for (int j = low; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    isSorted = false;
                    Integer d = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = d;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

}
