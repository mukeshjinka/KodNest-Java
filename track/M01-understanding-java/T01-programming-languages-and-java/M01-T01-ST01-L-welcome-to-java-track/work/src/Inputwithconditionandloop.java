import java.util.Scanner;

public class Inputwithconditionandloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        
        // Read the number of days
        // Calculate the total and display the progress status
        System.out.print("Enter the number of days you practiced coding : ");
        int practiceDays = scanner.nextInt();
        for(int i=1;i<=practiceDays;i++){
        int problems = scanner.nextInt();
        total =total+ problems;
        }
        System.out.println("Total solved: " + total);
        if (total >= 20){
            System.out.println("Status: Strong progress");
        }else if (total >= 10 && total<=19) {
            System.out.println("Status: Keep improving");
        }else{
            System.out.println("Status: Needs more practice");
        }
        scanner.close();
    }
}