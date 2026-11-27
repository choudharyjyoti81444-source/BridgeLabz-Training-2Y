package com.gla.LinkedList;
import java.util.*;

public class SocialMediaConnections {
    static class Node {
        int id, age;
        String name;
        ArrayList<Integer> friends = new ArrayList<>();
        Node next;

        Node(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    static Node head;

    static void addUser(int id, String name, int age) {
        Node n = new Node(id, name, age);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = n;
    }

    static Node find(int id) {
        Node temp = head;

        while (temp != null) {
            if (temp.id == id)
                return temp;

            temp = temp.next;
        }

        return null;
    }

    static void addFriend(int id1, int id2) {
        Node a = find(id1);
        Node b = find(id2);

        if (a != null && b != null && id1 != id2) {
            if (!a.friends.contains(id2))
                a.friends.add(id2);

            if (!b.friends.contains(id1))
                b.friends.add(id1);
        }
    }

    static void removeFriend(int id1, int id2) {
        Node a = find(id1);
        Node b = find(id2);

        if (a != null && b != null) {
            a.friends.remove(Integer.valueOf(id2));
            b.friends.remove(Integer.valueOf(id1));
        }
    }

    static void mutualFriends(int id1, int id2) {
        Node a = find(id1);
        Node b = find(id2);

        if (a == null || b == null) return;

        for (int id : a.friends) {
            if (b.friends.contains(id))
                System.out.println(id);
        }
    }

    static void displayFriends(int id) {
        Node temp = find(id);

        if (temp != null) {
            for (int friend : temp.friends) {
                Node f = find(friend);

                if (f != null)
                    System.out.println(f.id + " " + f.name);
            }
        }
    }

    static void search(String value) {
        Node temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(value) ||
                    String.valueOf(temp.id).equals(value)) {
                System.out.println(temp.id + " " + temp.name + " " + temp.age);
            }

            temp = temp.next;
        }
    }

    static void countFriends() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.name + " : " + temp.friends.size());
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add User 2.Add Friend 3.Remove Friend 4.Mutual Friends 5.Display Friends 6.Search 7.Count 8.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                addUser(sc.nextInt(), sc.next(), sc.nextInt());
            } else if (ch == 2) {
                addFriend(sc.nextInt(), sc.nextInt());
            } else if (ch == 3) {
                removeFriend(sc.nextInt(), sc.nextInt());
            } else if (ch == 4) {
                mutualFriends(sc.nextInt(), sc.nextInt());
            } else if (ch == 5) {
                displayFriends(sc.nextInt());
            } else if (ch == 6) {
                search(sc.next());
            } else if (ch == 7) {
                countFriends();
            } else {
                break;
            }
        }
    }
}
