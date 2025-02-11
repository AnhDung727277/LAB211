package week3;

import java.util.Scanner;

public class Test { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an algorithm to demo:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Binary Search");
            System.out.println("4. Stack Operations");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BubbleSort.performBubbleSort();
                    break;
                case 2:
                    QuickSort.performQuickSort();
                    break;
                case 3:
                    BinarySearch.performBinarySearch();
                    break;
                case 4:
                    MyStack.performStackDemo();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}