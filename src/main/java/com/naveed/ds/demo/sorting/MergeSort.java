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
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {33, 22, 66, 3, 36, 93, 27, 18, 40};
        mergeSort(arr);
        System.out.println("Sorted " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int[] first = new int[arr.length / 2];
        int[] second = new int[arr.length - first.length];
        System.arraycopy(arr, 0, first, 0, first.length);
        System.arraycopy(arr, first.length, second, 0, second.length);
        mergeSort(first);
        mergeSort(second);

        merge(first, second, arr);
    }

    private static void merge(int[] first, int[] second, int[] arr) {
        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if(first[iFirst] < second[iSecond]){
                arr[iMerged] = first[iFirst];
                iFirst++;
            } else {
                arr[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        System.arraycopy(first, iFirst, arr, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, arr, iMerged, second.length - iSecond);
    }
}
