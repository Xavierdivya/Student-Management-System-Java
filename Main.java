import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                	System.out.print("Enter ID: ");
                	int id=sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Course: ");
                    String course = sc.next();
                    System.out.print("Enter Grade: ");
                    String grade = sc.next();
                    dao.addStudent(new Student(id, name, age, course, grade));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    List<Student> students = dao.getAllStudents();
                    for (Student s : students) {
                        System.out.println(s.getId() + " | " + s.getName() + " | " + s.getAge() + " | " + s.getCourse() + " | " + s.getGrade());
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to Update: ");
                    int idU = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    String newName = sc.next();
                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.next();
                    System.out.print("Enter New Grade: ");
                    String newGrade = sc.next();
                    dao.updateStudent(new Student(idU, newName, newAge, newCourse, newGrade));
                    System.out.println("Student Updated!");
                    break;

                case 4:
                    System.out.print("Enter ID to Delete: ");
                    int idD = sc.nextInt();
                    dao.deleteStudent(idD);
                    System.out.println("Student Deleted!");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
       
    }
}
