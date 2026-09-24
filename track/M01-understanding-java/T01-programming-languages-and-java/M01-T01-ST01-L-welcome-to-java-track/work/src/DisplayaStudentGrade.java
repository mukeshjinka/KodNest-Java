public class DisplayaStudentGrade {
    public static void main (String[] args){
                // Display the correct grade
                int marks = 76;
            if (marks >= 80){
                System.out.println("Grade: A");
            }else if (marks >=60){
                System.out.println("Grade: B");
            }else if (marks >=40){
                System.out.println("Grade: C");
            }else{
                System.out.println("Fail");
            }
    }
}
