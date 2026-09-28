public import java.util.Scanner;

public class ReadandAddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first integer
        // Read the second integer
        // Calculate and print the sum
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int sum = firstInt + secondInt;
        System.out.println("Sum: " + sum);

        scanner.close();
    }
} 
    
}
