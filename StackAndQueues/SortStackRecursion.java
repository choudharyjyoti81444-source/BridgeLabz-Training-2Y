package com.gla.StackAndQueues;
import java.util.*;
public class SortStackRecursion {
    static Stack<Integer> stack = new Stack<>();

    static void insertSorted(int x) {
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        insertSorted(x);
        stack.push(temp);
    }

    static void sort() {
        if (stack.isEmpty())
            return;

        int x = stack.pop();
        sort();
        insertSorted(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            stack.push(sc.nextInt());

        sort();

        System.out.println(stack);
    }
}
