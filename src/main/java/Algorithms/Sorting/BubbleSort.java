package Algorithms.Sorting;

/*
	Best Case Sort: Merge Sort: O(n)
    Average Case Sort: Merge Sort: O(n²)
    Worst Case Sort: Merge Sort: O(n²)
*/

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    isSorted = false;
                }
            }
        }
    }

    static void bubbleSortOptimised(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            int lastSorted = arr.length - 1; //Every iteration already sorts last element, so no need to check last
            for (int i = 0; i < lastSorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    isSorted = false;
                    lastSorted--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 2, 7, 10, 5};

        System.out.println("Array Before Bubble Sort");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        bubbleSortOptimised(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
