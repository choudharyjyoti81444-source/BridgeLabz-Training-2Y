package com.gla.LinkedList;
import java.util.*;

public class TextEditorUndoRedo {
    static class Node {
        String text;
        Node prev, next;

        Node(String text) {
            this.text = text;
        }
    }

    static Node head, tail, current;
    static int size = 0;
    static final int LIMIT = 10;

    static void addState(String text) {
        Node n = new Node(text);

        if (current != null) {
            current.next = null;
            tail = current;
        }

        if (tail == null) {
            head = tail = current = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = current = n;
        }

        size++;

        if (size > LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    static void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    static void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    static void display() {
        if (current != null)
            System.out.println(current.text);
        else
            System.out.println("No Text");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add Text 2.Undo 3.Redo 4.Display 5.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                String text = sc.nextLine();
                addState(text);
            } else if (ch == 2) {
                undo();
            } else if (ch == 3) {
                redo();
            } else if (ch == 4) {
                display();
            } else {
                break;
            }
        }
    }
}
