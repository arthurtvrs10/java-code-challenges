# 💼 Employee Management System — Pure Java

Project developed in pure Java to practice fundamental concepts of Object-Oriented Programming and concurrency.

## 📚 Concepts Practiced

* Constructor overloading
* Inheritance
* Polymorphism
* Threads
* Exception handling with try/catch

---

# 📌 Challenge Description

Develop a pure Java system to represent company employees.

The system must contain a main class called `Employee` and other classes representing specific employee roles.

## Requirements

1. Create an `Employee` class with the following attributes:

   * name
   * salary

2. Implement constructor overloading in the `Employee` class with:

   * an empty constructor
   * a constructor that receives only the name
   * a constructor that receives name and salary

3. Create a method called `work()` inside the `Employee` class.

4. Create the following classes:

   * `Developer`
   * `Designer`

   Both classes must inherit from `Employee`.

5. Override the `work()` method in each child class with different behaviors.

6. In the main class:

   * create objects using polymorphism
   * store child class objects in variables of type `Employee`

7. Use `Thread` to simulate employee work execution.

8. Inside the Thread:

   * display a message indicating the start of the work
   * execute the `work()` method
   * pause the Thread for 2 seconds
   * display a message indicating the end of the work

9. Use `try/catch` to handle possible exceptions during Thread execution.

10. Run the program demonstrating all requested concepts.

---

# 🚀 Objective

Practice the main pillars of Object-Oriented Programming and basic concurrency concepts using pure Java without frameworks.

---

# 🛠️ Technologies

* Java
* Object-Oriented Programming (OOP)
* Native Java Threads

---

# 📂 Expected Structure

```text id="ykxryq"
src/
 ├── Employee.java
 ├── Developer.java
 ├── Designer.java
 └── Main.java
```

---

# ▶️ How to Run

Compile the files:

```bash id="7zh0qn"
javac *.java
```

Run the application:

```bash id="e8yy7x"
java Main
```
