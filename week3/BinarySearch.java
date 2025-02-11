package week3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch { 

    public static void performBinarySearch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = generateRandomArray(n);

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.print("Enter a number to search: ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found in the array.");
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // Random integers between 0 and 99
        }
        return arr;
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}