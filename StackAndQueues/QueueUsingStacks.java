package com.gla.StackAndQueues;
import java.util.*;
public class QueueUsingStacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enqueue(int x) {
        s1.push(x);
    }

    static int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }

        return s2.pop();
    }

    static void display() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = s2.size() - 1; i >= 0; i--)
            System.out.print(s2.get(i) + " ");

        for (int i = 0; i < s1.size(); i++)
            System.out.print(s1.get(i) + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Enqueue 2.Dequeue 3.Display 4.Exit");
            int ch = sc.nextInt();

            if (ch == 1)
                enqueue(sc.nextInt());
            else if (ch == 2)
                System.out.println(dequeue());
            else if (ch == 3)
                display();
            else
                break;
        }
    }
}
