# Employee Management System

Simple Java application developed to practice core Object-Oriented Programming concepts and basic concurrency using pure Java.

---

# Challenge Description

Develop a pure Java system to represent company employees.

## Requirements

1. Create a parent class called `Employee`
2. Add the following attributes:

   * `name`
   * `salary`
3. Implement constructor overloading in the `Employee` class
4. Create a method called `work()`
5. Create the classes:

   * `Developer`
   * `Designer`
6. Both classes must inherit from `Employee`
7. Override the `work()` method in each child class
8. Demonstrate polymorphism in the `main` method
9. Use `Thread` to simulate employee work execution
10. Use `try/catch` to handle possible thread execution exceptions

---

# Concepts Practiced

* Constructor Overloading
* Inheritance
* Polymorphism
* Threads
* Exception Handling (`try/catch`)

---

# Technologies

* Java
* Object-Oriented Programming (OOP)
* Native Java Threads

---

# Project Structure

```text id="rgn5cf"
src/
 ├── Employee.java
 ├── Developer.java
 ├── Designer.java
 └── Main.java
```

---

# Execution Example

```text id="p7abj4"
Starting threads processing...
I'm developing a SaaS application
Threads processed successfully.
Main finished
```
