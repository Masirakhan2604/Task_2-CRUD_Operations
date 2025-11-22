# 📚 Java OOP + JDBC Mini Project
A simple **Java OOP + PostgreSQL JDBC** project demonstrating:
- Object-Oriented Programming (Encapsulation, Inheritance, Polymorphism, Abstraction)
- JDBC CRUD Operations (Insert, Select, Update, Delete)
- PostgreSQL Database Connection

---

## 🚀 Project Structure

src
 └── main
      └── java
          └── com.myproject
              ├── Student.java
              ├── Employee.java
              ├── BankAccount.java
              ├── DBOperations.java
              └── Main.java


---

## 🧩 OOP Classes
### ✔ Student Class
- Private fields (id, name, age, course)
- Getters & Setters
- study(), displayInfo(), toString()

### ✔ Employee Class
- work(), promote(), toString()

### ✔ BankAccount Class
- deposit(), withdraw(), toString()

---

## 🧱 OOP 4 Pillars Demonstrated
### 🔒 Encapsulation
- All fields are **private** with public getters/setters.

### 🧬 Inheritance

class Person {}
class Student extends Person {}
class Employee extends Person {}


### 🔁 Polymorphism

public void work() { }
Student.work();     // 
Employee.work();    


### ✨ Abstraction

interface Printable {
    void printDetails();
}


---

## 🗄 PostgreSQL Setup
Run this SQL in pgAdmin:
   sql
CREATE TABLE students(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    age INT
);


---

# 🛠 JDBC CRUD Operations
### ✔ Task 1 — INSERT

insertStudent(String name, int age);


### ✔ Task 2 — SELECT

getAllStudents();


### ✔ Task 3 — UPDATE

updateStudent(int id, String newName);


### ✔ Task 4 — DELETE
```
deleteStudent(int id);


---

## 🔗 Database Connection (Main.java)

Connection con = DriverManager.getConnection(
    "jdbc:postgresql://localhost:5433/postgres",
    "postgres",
    "YOUR_PASSWORD"
);







If you need help improving the project or adding more features, feel free to ask! 😊
