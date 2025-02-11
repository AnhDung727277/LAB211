package week3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort { 
    public static void performBubbleSort() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = generateRandomArray(n);

        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); 
        }
        return arr;
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
