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
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {33, 22, 66, 3, 36, 93, 27, 18, 40};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(" Sorted " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        System.out.println("Middle " + middle + " " + pivot);

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            System.out.println(">>>>>>>>>>>>> $$ij " + i + " " + j);
            if(i <= j){
                swap(arr, i, j);
                i++;
                j--;
            }
            System.out.println(" >>>>> " + Arrays.toString(arr));
        }
        System.out.println(">>>>>>>>>>>>> 1 " + i + " " + j);
        System.out.println(">>>>>>>>>>>>> 2 " + low + " " + high);
        if(low <= j){
            quickSort(arr, low, j);
        }
        if(high > i ){
            quickSort(arr, i, high);
        }
    }

    private static int[] swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }

}
