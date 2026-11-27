package com.gla.StackAndQueues;
import java.util.*;

public class CustomHashMap {
    static class MyHashMap {

        static class Node {
            int key, value;
            Node next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        Node[] table = new Node[10];

        int hash(int key) {
            return Math.floorMod(key, table.length);
        }

        void put(int key, int value) {
            int index = hash(key);
            Node temp = table[index];

            while (temp != null) {
                if (temp.key == key) {
                    temp.value = value;
                    return;
                }

                temp = temp.next;
            }

            Node n = new Node(key, value);
            n.next = table[index];
            table[index] = n;
        }

        int get(int key) {
            int index = hash(key);
            Node temp = table[index];

            while (temp != null) {
                if (temp.key == key)
                    return temp.value;

                temp = temp.next;
            }

            return -1;
        }

        void remove(int key) {
            int index = hash(key);
            Node temp = table[index];
            Node prev = null;

            while (temp != null) {
                if (temp.key == key) {
                    if (prev == null)
                        table[index] = temp.next;
                    else
                        prev.next = temp.next;

                    return;
                }

                prev = temp;
                temp = temp.next;
            }
        }

        void display() {
            for (int i = 0; i < table.length; i++) {
                Node temp = table[i];

                while (temp != null) {
                    System.out.println(temp.key + " = " + temp.value);
                    temp = temp.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyHashMap map = new MyHashMap();

        while (true) {
            System.out.println("1.Insert 2.Get 3.Delete 4.Display 5.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                map.put(sc.nextInt(), sc.nextInt());
            } else if (ch == 2) {
                System.out.println(map.get(sc.nextInt()));
            } else if (ch == 3) {
                map.remove(sc.nextInt());
            } else if (ch == 4) {
                map.display();
            } else {
                break;
            }
        }
    }
}
