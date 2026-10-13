import java.util.Scanner;

class Student {
    int id;
    String name;
    int javaScore;
}

public class Create&comparetwoobjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create first student object
        Student stu1 = new Student();
        stu1.id = scanner.nextInt();
        stu1.name = scanner.next();
        stu1.javaScore = scanner.nextInt();

        // Create second student object
        Student stu2 = new Student();
        stu2.id = scanner.nextInt();
        stu2.name = scanner.next();
        stu2.javaScore = scanner.nextInt();

        // Print both student records
        System.out.println(stu1.id + " - " + stu1.name + " - " + stu1.javaScore);
        System.out.println(stu2.id + " - " + stu2.name + " - " + stu2.javaScore);

        // Compare scores and print result
        if (stu1.javaScore > stu2.javaScore) {
            System.out.println(stu1.name + " has the higher Java score.");
        } else if (stu2.javaScore > stu1.javaScore) {
            System.out.println(stu2.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }
        
        scanner.close();
    }
}