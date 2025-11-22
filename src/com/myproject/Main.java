package com.myproject;

public class Main {
    public static void main(String[] args) {

        DBOperations db = new DBOperations();

        Student s = new Student(1, "Ayesha", "CS");
        Employee e = new Employee(100, "Masira", 50000);
        BankAccount b = new BankAccount(2001, "Khan", 90000);

        db.saveStudent(s);
        db.saveEmployee(e);
        db.saveBankAccount(b);
    }
}
