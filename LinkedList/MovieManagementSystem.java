package com.gla.LinkedList;
import java.util.*;

public class MovieManagementSystem {
    static class Node {
        String title, director;
        int year;
        double rating;
        Node prev, next;

        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }

    static Node head, tail;

    static void add(String title, String director, int year, double rating, int pos) {
        Node n = new Node(title, director, year, rating);

        if (head == null) {
            head = tail = n;
            return;
        }

        if (pos <= 1) {
            n.next = head;
            head.prev = n;
            head = n;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;

        n.next = temp.next;
        n.prev = temp;

        if (temp.next != null)
            temp.next.prev = n;
        else
            tail = n;

        temp.next = n;
    }

    static void delete(String title) {
        Node temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title))
            temp = temp.next;

        if (temp == null) return;

        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
        else
            tail = temp.prev;
    }

    static void search(String value) {
        Node temp = head;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(value) ||
                    String.valueOf(temp.rating).equals(value)) {
                System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            }
            temp = temp.next;
        }
    }

    static void update(String title, double rating) {
        Node temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = rating;
                return;
            }
            temp = temp.next;
        }
    }

    static void forward() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    static void reverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Delete 3.Search 4.Forward 5.Reverse 6.Update 7.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                String t = sc.next();
                String d = sc.next();
                int y = sc.nextInt();
                double r = sc.nextDouble();
                int p = sc.nextInt();
                add(t, d, y, r, p);
            } else if (ch == 2) {
                delete(sc.next());
            } else if (ch == 3) {
                search(sc.next());
            } else if (ch == 4) {
                forward();
            } else if (ch == 5) {
                reverse();
            } else if (ch == 6) {
                String t = sc.next();
                double r = sc.nextDouble();
                update(t, r);
            } else {
                break;
            }
        }
    }
}
