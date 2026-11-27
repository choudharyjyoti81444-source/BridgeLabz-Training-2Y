package com.gla.LinkedList;

import java.util.*;
public class StudentRecordManagement {
    static class Node {
        int roll, age;
        String name, grade;
        Node next;

        Node(int roll, String name, int age, String grade) {
            this.roll = roll;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    static Node head;

    static void add(int roll, String name, int age, String grade, int pos) {
        Node n = new Node(roll, name, age, grade);

        if (pos <= 1 || head == null) {
            n.next = head;
            head = n;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;

        n.next = temp.next;
        temp.next = n;
    }

    static void delete(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    static void search(int roll) {
        Node temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student Not Found");
    }

    static void update(int roll, String grade) {
        Node temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Delete 3.Search 4.Display 5.Update 6.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                int r = sc.nextInt();
                String n = sc.next();
                int a = sc.nextInt();
                String g = sc.next();
                int p = sc.nextInt();
                add(r, n, a, g, p);
            } else if (ch == 2) {
                delete(sc.nextInt());
            } else if (ch == 3) {
                search(sc.nextInt());
            } else if (ch == 4) {
                display();
            } else if (ch == 5) {
                int r = sc.nextInt();
                String g = sc.next();
                update(r, g);
            } else {
                break;
            }
        }
    }
}
