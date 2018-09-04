package main.charter02.InsertSort;

import main.SortTestHelper;

/**
 * Created by JY on 2018/9/3 0003
 * 插入排序
 * O(n^2)但是由于可以中断，在近似有序的数据时，几乎是O(n)，效率高
 * 比较 找合适位置插入，当前位置元素比前一个元素要大
 * 则位置已经合适，否则，交换位置，循环下去，但可以中断，到合适
 * 位置就停止，到一下个元素插入
 */
public class InsertSort {
    private InsertSort() {
    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            //寻找元素arr[i]合适的插入位置     arr[j]>arr[j-1]  false则-1,所以交换
            //写法一：性能不如选择排序快
            // for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--)
            //    swap(arr, j, j - 1);
            //写法二
            Comparable e = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--)
                arr[j] = arr[j - 1];
            arr[j] = e;
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 10000);
        InsertSort.sort(arr);
        SortTestHelper.printArray(arr);
        SortTestHelper.testSort("main.charter02.InsertSort.InsertSort", arr);
    }
}
