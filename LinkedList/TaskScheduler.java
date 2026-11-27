package com.gla.LinkedList;
import java.util.*;

public class TaskScheduler {
    static class Node {
        int id, priority;
        String name, date;
        Node next;

        Node(int id, String name, int priority, String date) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.date = date;
        }
    }

    static Node head, current;

    static void add(int id, String name, int priority, String date, int pos) {
        Node n = new Node(id, name, priority, date);

        if (head == null) {
            head = n;
            n.next = head;
            current = head;
            return;
        }

        if (pos <= 1) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            n.next = head;
            temp.next = n;
            head = n;
            return;
        }

        Node temp = head;
        int i = 1;

        while (i < pos - 1 && temp.next != head) {
            temp = temp.next;
            i++;
        }

        n.next = temp.next;
        temp.next = n;
    }

    static void delete(int id) {
        if (head == null) return;

        Node temp = head, prev = null;

        do {
            if (temp.id == id) {
                if (temp == head && temp.next == head) {
                    head = current = null;
                    return;
                }

                if (prev == null) {
                    Node last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }

                if (current == temp)
                    current = temp.next;

                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);
    }

    static void nextTask() {
        if (current == null) {
            System.out.println("No Tasks");
            return;
        }

        System.out.println(current.id + " " + current.name + " " + current.priority + " " + current.date);
        current = current.next;
    }

    static void display() {
        if (head == null) return;

        Node temp = head;

        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.date);
            temp = temp.next;
        } while (temp != head);
    }

    static void search(int priority) {
        if (head == null) return;

        Node temp = head;

        do {
            if (temp.priority == priority)
                System.out.println(temp.id + " " + temp.name + " " + temp.date);

            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Delete 3.Next Task 4.Display 5.Search 6.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                int id = sc.nextInt();
                String name = sc.next();
                int priority = sc.nextInt();
                String date = sc.next();
                int pos = sc.nextInt();
                add(id, name, priority, date, pos);
            } else if (ch == 2) {
                delete(sc.nextInt());
            } else if (ch == 3) {
                nextTask();
            } else if (ch == 4) {
                display();
            } else if (ch == 5) {
                search(sc.nextInt());
            } else {
                break;
            }
        }
    }
}
