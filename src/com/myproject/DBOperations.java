package com.myproject;

public class DBOperations {

    public void saveStudent(Student s) {
        System.out.println("Saving Student to DB...");
        s.printDetails();
    }

    public void saveEmployee(Employee e) {
        System.out.println("Saving Employee to DB...");
        e.printDetails();
    }

    public void saveBankAccount(BankAccount b) {
        System.out.println("Saving Bank Account to DB...");
        b.printDetails();
    }
}
