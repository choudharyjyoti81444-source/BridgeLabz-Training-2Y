package com.gla.StackAndQueues;
import java.util.*;

public class StockSpan {
    static void calculateSpan(int[] price, int n) {
        Stack<Integer> st = new Stack<>();
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();

            if (st.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - st.peek();

            st.push(i);
        }

        for (int x : span)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();

        calculateSpan(price, n);
    }
}
