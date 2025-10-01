# 🎓 Student Management System (Java + JDBC)

A simple **Student Management System** built using **Core Java** and **JDBC** to perform basic CRUD operations with a MySQL database.

---

## 🚀 Features
- ➕ Add new students
- 📋 View all students
- ✏️ Update student details
- ❌ Delete student records
- 🔍 Search by ID (optional feature)

---

## 🏗 Tech Stack
- **Java (Core Java)**
- **JDBC** (Java Database Connectivity)
- **MySQL** (Database)

---

## 📂 Project Structure
StudentManagementSystem/

├── DBConnection.java # Database connection utility

├── Student.java # Student model (POJO)

├── StudentDAO.java # DAO layer (CRUD operations)

└── Main.java # Menu-driven program

---

## 🗄 Database Setup
1. Create a database in MySQL:
   ```sql
   CREATE DATABASE studentdb;
   USE studentdb;
   
2. Create a students table:
   CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    course VARCHAR(50),
    grade VARCHAR(5)
);

## How to Run
1. Clone this repository:
   git clone https://github.com/yourusername/Student-Management-System-Java.git
   cd Student-Management-System-Java

2. Open the project in your IDE (Eclipse/IntelliJ/NetBeans).

3. Update DBConnection.java with your MySQL username & password:
   private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
   private static final String USER = "root";
   private static final String PASSWORD = "yourpassword";

4. Run Main.java.

---

##  📸 Sample Output
=== Student Management System ===
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Exit
Choose an option:

---

## 🌟 Learning Outcomes

- Connecting Java with MySQL using JDBC
- Implementing DAO pattern
- Practicing object-oriented programming concepts
- Building a simple CLI-based CRUD application

---

## 🙌 Author  
**Divya Xavier**  
- 🌐 [LinkedIn](https://www.linkedin.com/in/divya-xavier-3b5317290/)  
- 💻 [GitHub](https://github.com/YourGitHubUsername)  
- ✉️ your.email@example.com  
