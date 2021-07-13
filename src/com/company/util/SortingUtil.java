package com.company.util;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 13.07.2021.
 * Time: 11:35.
 */
public class SortingUtil {
    private SortingUtil() {
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(char[] arr, int leftBorder, int rightBorder) {
        int left = leftBorder; // left increment
        int right = rightBorder; // right increment
        int pivot = arr[(left + right) / 2]; // support element by which can find smaller and bigger element than that
        // we can choose the pivot first or last element , but have a chance
        // that elements is smaller or bigger element in array and that time this method not more effective
        do {
            while (arr[left] < pivot) { // find grater element before pivot and fix it
                left++;
            }
            while (arr[right] > pivot) { // find less element after pivot and fix it
                right--;
            }
            if (left <= right) {
                if (left < right) { // if true doing swap between right side and left side arrays elements
                    swap(arr, left, right);
                }
                // Move Increments to get new borders for Do while cycle
                left++;
                right--;
            }
        } while (left <= right);
        // with recursion we do sorting after left or right increment reaches Arrays border
        if (left < rightBorder) {
            quickSort(arr, left, rightBorder);
        }
        if (leftBorder < right) {
            quickSort(arr, leftBorder, right);
        }
        // Time Complexity in best Case O(nLogn) and average Case is also O(nLogn) , but worst Case O(n^2)
        // if pivot is every time will be bigger or lesser element in the array
    }

    // Function to sort array using insertion sort
    public static void insertionsort(int array[]) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int key = array[i]; // Key is that element whose must compare another elements from unsorted array
            int j = i - 1; // J is index who moves in Array right to left and check is greater than key , and change the index greater element to smaller
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // if true in array[i] index  element changed by array{i-1] index element
                j--;
            }
            array[j + 1] = key; // array[i-1] index element's changed by smaller key , because array[i-1] > array[i] and key = array[i]
        }
    }

    // Time Complexity O(n^2) , if array already Sorted in the opposite direction then Time Complexity is the worst
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
