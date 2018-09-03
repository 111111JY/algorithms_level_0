package main.charter02.SelectionSort;

import main.SortTestHelper;

/**
 * Created by JY on 2018/9/3 0003
 */
public class SelectionSort_generate_test {
    private SelectionSort_generate_test() {
    }

    @SuppressWarnings("Duplicates")
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            //寻找[i,n)区间里的最小值的索引
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                //控制排正序还是倒序，这是正序
                if (arr[j].compareTo(arr[minIndex])<0)
                    minIndex = j;
            swap(arr, i, minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        //测试排序算法辅助函数
        int N = 10000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 10000);
        SelectionSort_generate_test.sort(arr);
        SortTestHelper.printArray(arr);
        SortTestHelper.testSort("main.charter02.SelectionSort.SelectionSort_generate_test",arr);
    }
}
