package main.charter02.BubbleSort;

import main.SortTestHelper;

/**
 * Created by JY on 2018/9/3 0003
 * 冒泡排序   相邻两个元素比较，小的在前面，循环下去
 */
public class BubbleSort {
    private BubbleSort() {
    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    swap(arr, i - 1, i);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int N = 10000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, N);
        BubbleSort.sort(arr);
        SortTestHelper.printArray(arr);
        SortTestHelper.testSort("main.charter02.BubbleSort.BubbleSort", arr);
    }
}