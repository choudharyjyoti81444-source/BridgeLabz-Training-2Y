package com.gla.LinkedList;
import java.util.*;

public class InventoryManagementSystem {
    static class Node {
        int id, quantity;
        String name;
        double price;
        Node next;

        Node(int id, String name, int quantity, double price) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    static Node head;

    static void add(int id, String name, int quantity, double price, int pos) {
        Node n = new Node(id, name, quantity, price);

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

    static void delete(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.id != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    static void update(int id, int quantity) {
        Node temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = quantity;
                return;
            }
            temp = temp.next;
        }
    }

    static void search(String value) {
        Node temp = head;

        while (temp != null) {
            if (String.valueOf(temp.id).equals(value) ||
                    temp.name.equalsIgnoreCase(value)) {
                System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
            }
            temp = temp.next;
        }
    }

    static void totalValue() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    static void sort(int choice, int order) {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                boolean swap;

                if (choice == 1)
                    swap = order == 1 ? i.name.compareToIgnoreCase(j.name) > 0 :
                            i.name.compareToIgnoreCase(j.name) < 0;
                else
                    swap = order == 1 ? i.price > j.price : i.price < j.price;

                if (swap) {
                    int id = i.id;
                    String name = i.name;
                    int quantity = i.quantity;
                    double price = i.price;

                    i.id = j.id;
                    i.name = j.name;
                    i.quantity = j.quantity;
                    i.price = j.price;

                    j.id = id;
                    j.name = name;
                    j.quantity = quantity;
                    j.price = price;
                }
            }
        }
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Delete 3.Update 4.Search 5.Total 6.Sort 7.Display 8.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                int id = sc.nextInt();
                String name = sc.next();
                int q = sc.nextInt();
                double p = sc.nextDouble();
                int pos = sc.nextInt();
                add(id, name, q, p, pos);
            } else if (ch == 2) {
                delete(sc.nextInt());
            } else if (ch == 3) {
                update(sc.nextInt(), sc.nextInt());
            } else if (ch == 4) {
                search(sc.next());
            } else if (ch == 5) {
                totalValue();
            } else if (ch == 6) {
                sort(sc.nextInt(), sc.nextInt());
            } else if (ch == 7) {
                display();
            } else {
                break;
            }
        }
    }
}
