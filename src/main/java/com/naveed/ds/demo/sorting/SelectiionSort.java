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
 *
 * O(n2)
 *
 */
public class SelectiionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{53, 22, 66, 3, 36, 93, 27, 18, 40};
        selectionSort(arr, 0, arr.length);
        System.out.println(" Sorted " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int low, int high) {
        for (int pass = low; pass < high - 1; pass++) {
            int min = pass;
            for (int i = pass + 1; i < high; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            if (min != pass) {
                swap(arr, min, pass);
            }
        }
    }

    private static int[] swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }
}
