package com.gla.LinkedList;
import java.util.*;

public class LibraryManagementSystem {
    static class Node {
        int id;
        String title, author, genre;
        boolean available;
        Node prev, next;

        Node(int id, String title, String author, String genre, boolean available) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.available = available;
        }
    }

    static Node head, tail;

    static void add(int id, String title, String author, String genre, boolean available, int pos) {
        Node n = new Node(id, title, author, genre, available);

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

    static void delete(int id) {
        Node temp = head;

        while (temp != null && temp.id != id)
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
            if (temp.title.equalsIgnoreCase(value) ||
                    temp.author.equalsIgnoreCase(value)) {
                System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre);
            }
            temp = temp.next;
        }
    }

    static void update(int id, boolean status) {
        Node temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    static void forward() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.available);
            temp = temp.next;
        }
    }

    static void reverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.available);
            temp = temp.prev;
        }
    }

    static void count() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Delete 3.Search 4.Update 5.Forward 6.Reverse 7.Count 8.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                int id = sc.nextInt();
                String title = sc.next();
                String author = sc.next();
                String genre = sc.next();
                boolean status = sc.nextBoolean();
                int pos = sc.nextInt();
                add(id, title, author, genre, status, pos);
            } else if (ch == 2) {
                delete(sc.nextInt());
            } else if (ch == 3) {
                search(sc.next());
            } else if (ch == 4) {
                update(sc.nextInt(), sc.nextBoolean());
            } else if (ch == 5) {
                forward();
            } else if (ch == 6) {
                reverse();
            } else if (ch == 7) {
                count();
            } else {
                break;
            }
        }
    }
}
