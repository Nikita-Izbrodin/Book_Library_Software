package com.company;

public class Patron extends Accounts {
    public Patron(String username, String password) {
        super(username, password);
    }

    void borrowBook() {
        System.out.println("Book borrowed");
    }

    void returnBook() {
        System.out.println("Book returned");
    }
}
