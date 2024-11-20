package library.src;

import java.util.Date;

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        // Create a new book
        Book book1 = new Book("1984", "George Orwell", "1234567890");

        // Create a new member
        Member member1 = new Member("Alice", "M001");

        // Create a new transaction
        Transaction transaction1 = new Transaction(book1, member1, new Date());

        // Display details
        System.out.println(book1);
        System.out.println(member1);
        System.out.println(transaction1);

        // Return the book
        transaction1.returnBook(new Date());
        System.out.println("After returning the book:");
        System.out.println(transaction1);
    }
}

