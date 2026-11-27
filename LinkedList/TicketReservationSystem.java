package com.gla.LinkedList;
import java.util.*;

public class TicketReservationSystem {
    static class Node {
        int ticketId, seat;
        String customer, movie, time;
        Node next;

        Node(int ticketId, String customer, String movie, int seat, String time) {
            this.ticketId = ticketId;
            this.customer = customer;
            this.movie = movie;
            this.seat = seat;
            this.time = time;
        }
    }

    static Node head, tail;

    static void add(int id, String customer, String movie, int seat, String time) {
        Node n = new Node(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = n;
            n.next = head;
        } else {
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }

    static void delete(int id) {
        if (head == null) return;

        Node temp = head;
        Node prev = tail;

        do {
            if (temp.ticketId == id) {
                if (head == tail) {
                    head = tail = null;
                    return;
                }

                if (temp == head)
                    head = head.next;
                else
                    prev.next = temp.next;

                if (temp == tail)
                    tail = prev;

                tail.next = head;
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);
    }

    static void display() {
        if (head == null) {
            System.out.println("No Bookings");
            return;
        }

        Node temp = head;

        do {
            System.out.println(temp.ticketId + " " + temp.customer + " " +
                    temp.movie + " " + temp.seat + " " + temp.time);

            temp = temp.next;

        } while (temp != head);
    }

    static void search(String value) {
        if (head == null) return;

        Node temp = head;

        do {
            if (temp.customer.equalsIgnoreCase(value) ||
                    temp.movie.equalsIgnoreCase(value)) {
                System.out.println(temp.ticketId + " " + temp.customer + " " +
                        temp.movie + " " + temp.seat + " " + temp.time);
            }

            temp = temp.next;

        } while (temp != head);
    }

    static void count() {
        int count = 0;

        if (head != null) {
            Node temp = head;

            do {
                count++;
                temp = temp.next;
            } while (temp != head);
        }

        System.out.println("Total Booked Tickets: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add Ticket 2.Delete Ticket 3.Display 4.Search 5.Count 6.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                int id = sc.nextInt();
                String customer = sc.next();
                String movie = sc.next();
                int seat = sc.nextInt();
                String time = sc.next();

                add(id, customer, movie, seat, time);

            } else if (ch == 2) {
                delete(sc.nextInt());

            } else if (ch == 3) {
                display();

            } else if (ch == 4) {
                search(sc.next());

            } else if (ch == 5) {
                count();

            } else {
                break;
            }
        }
    }
}
