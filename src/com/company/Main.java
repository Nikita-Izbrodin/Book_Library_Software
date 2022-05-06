package com.company;

public class Main {

    public static void main(String[] args) {
        Patron person = new Patron("person","password");
        System.out.println(person.username);
        System.out.println(person.password);
        person.borrowBook();
        person.returnBook();

        System.out.println();

        Employee staff = new Employee("nick","password222");
        System.out.println(staff.username);
        System.out.println(staff.password);
    }
}
