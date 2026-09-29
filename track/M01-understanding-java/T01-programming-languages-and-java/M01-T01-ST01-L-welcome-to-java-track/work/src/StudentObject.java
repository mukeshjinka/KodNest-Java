import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double javaScore;
}

public class StudentObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        Student student2 = new Student();

        student.id = scanner.nextInt();
        student.name = scanner.next();
        student.course = scanner.next();
        student.javaScore = scanner.nextDouble();

        //for second object
        student2.id = scanner.nextInt();
        student2.name = scanner.next();
        student2.course = scanner.next();
        student2.javaScore = scanner.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Course: " + student.course);
        System.out.println("Java Score: " + student.javaScore);

        //  for second object
        System.out.println("Student Profile");
        System.out.println(student2.id);
        System.out.println(student2.name);
        System.out.println(student2.course);
        System.out.println(student2.javaScore);
        
    }
}
