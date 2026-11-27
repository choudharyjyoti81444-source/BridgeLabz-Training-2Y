package com.gla.LinkedList;
import java.util.*;

public class RoundRobinScheduling {
    static class Node {
        int id, burst, remaining, priority, completion;
        Node next;

        Node(int id, int burst, int priority) {
            this.id = id;
            this.burst = burst;
            this.remaining = burst;
            this.priority = priority;
        }
    }

    static Node head, tail;

    static void add(int id, int burst, int priority) {
        Node n = new Node(id, burst, priority);

        if (head == null) {
            head = tail = n;
            n.next = head;
        } else {
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }

    static void display() {
        if (head == null) return;

        Node temp = head;

        do {
            System.out.println("P" + temp.id + " Remaining: " + temp.remaining);
            temp = temp.next;
        } while (temp != head);
    }

    static void schedule(int quantum) {
        if (head == null || quantum <= 0) return;

        int time = 0;
        int total = 0;
        int completed = 0;
        int waiting = 0;
        int turnaround = 0;

        Node temp = head;

        do {
            total++;
            temp = temp.next;
        } while (temp != head);

        while (completed < total) {
            temp = head;
            boolean executed = false;

            do {
                if (temp.remaining > 0) {
                    int run = Math.min(quantum, temp.remaining);
                    temp.remaining -= run;
                    time += run;
                    executed = true;

                    if (temp.remaining == 0) {
                        temp.completion = time;
                        completed++;
                        waiting += temp.completion - temp.burst;
                        turnaround += temp.completion;
                    }
                }

                temp = temp.next;

            } while (temp != head);

            if (executed) {
                System.out.println("After Round:");
                display();
            }
        }

        System.out.println("Average Waiting Time: " + (double) waiting / total);
        System.out.println("Average Turnaround Time: " + (double) turnaround / total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add Process 2.Display 3.Schedule 4.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                int id = sc.nextInt();
                int burst = sc.nextInt();
                int priority = sc.nextInt();
                add(id, burst, priority);
            } else if (ch == 2) {
                display();
            } else if (ch == 3) {
                schedule(sc.nextInt());
                break;
            } else {
                break;
            }
        }
    }
}
