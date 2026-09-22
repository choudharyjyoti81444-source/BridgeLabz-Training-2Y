package com.gla.Library_Management_Scenario_Questions;

import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class LibraryManagementSystem {
    // Task 1
    public static int removeDuplicates(Book[] books, int n) {
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (books[i].bookId != books[count - 1].bookId) {
                books[count] = books[i];
                count++;
            }
        }
        return count;
    }

    // Task 2
    public static void searchByTitle(Book[] books, int count, String query) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(query.toLowerCase())) {

                System.out.println("Found: [" + books[i].bookId + "] "
                        + books[i].title + " - Rs. " + books[i].price);
            }
        }
    }

    // Task 3
    public static void sortByPrice(Book[] books, int count) {
        int swaps = 0;
        for (int i = 0; i < count - 1; i++) {
            int min = i;

            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[min].price) {
                    min = j;
                }
            }

            if (min != i) {
                Book temp = books[i];
                books[i] = books[min];
                books[min] = temp;
                swaps++;
            }
        }
        System.out.println("\nSorted Books:");
        for (int i = 0; i < count; i++) {
            System.out.println("[" + books[i].bookId + "] "
                    + books[i].title + " - Rs. " + books[i].price);
        }
        System.out.println("Total Swaps: " + swaps);
    }

    // Task 4
    public static int searchByPrice(Book[] books, int count, double price) {
        int start = 0;
        int end = count - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (books[mid].price == price) {
                return mid;
            }

            if (books[mid].price < price) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // Task 5
    public static int minBooksForTargetCost(Book[] books, int count,double target) {
        int left = 0;
        double sum = 0;
        int min = count + 1;

        for (int right = 0; right < count; right++) {
            sum = sum + books[right].price;

            while (sum >= target) {
                int length = right - left + 1;
                if (length < min) {
                    min = length;
                }

                sum = sum - books[left].price;
                left++;
            }
        }
        if (min == count + 1) {
            return 0;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = {
                new Book(101, "Data Structures", "Mark", 400),
                new Book(101, "Data Structures", "Mark", 400),
                new Book(102, "Java Basics", "James", 300),
                new Book(103, "Python Guide", "Guido", 600),
                new Book(104, "Database Systems", "Raghu", 500),
                new Book(105, "Computer Networks", "Andrew", 700)
        };

        int count = books.length;

        // Task 1
        count = removeDuplicates(books, count);
        System.out.println("Unique Books: " + count);

        // Task 2
        System.out.print("\nEnter title to search: ");
        String query = sc.nextLine();

        searchByTitle(books, count, query);

        // Task 3
        sortByPrice(books, count);

        // Task 4
        System.out.print("\nEnter price to search: ");
        double price = sc.nextDouble();
        int index = searchByPrice(books, count, price);

        if (index != -1) {
            System.out.println("Book found at index: " + index);
            System.out.println(books[index].title);
        } else {
            System.out.println("Book not found");
        }

        // Task 5
        System.out.print("\nEnter target cost: ");
        double target = sc.nextDouble();
        int answer = minBooksForTargetCost(books, count, target);

        System.out.println("Minimum books needed: " + answer);
    }
}
