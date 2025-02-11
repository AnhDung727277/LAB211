package week3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class MyStack { 

    private List<Integer> stackValues;

    public MyStack() {
        stackValues = new ArrayList<>();
    }

    public void push(int value) {
        stackValues.add(value);
    }

    public int pop() {
        if (stackValues.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackValues.remove(stackValues.size() - 1);
    }

    public int get() {
        if (stackValues.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackValues.get(stackValues.size() - 1);
    }

    public static void performStackDemo() {
        MyStack stack = new MyStack();
        Scanner sc = new Scanner(System.in);

        System.out.println("Stack Operations:");
        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Top");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    try {
                        System.out.println("Popped value: " + stack.pop());
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Top value: " + stack.get());
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}