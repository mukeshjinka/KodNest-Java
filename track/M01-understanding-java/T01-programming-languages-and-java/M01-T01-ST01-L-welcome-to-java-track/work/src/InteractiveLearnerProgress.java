
    import java.util.Scanner;
public class InteractiveLearnerProgress {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        System.out.println("Learner: " + fullName);
        int days = scanner.nextInt();
        for (int i = 1 ; i<=days ; i++){
            int solvedproblems = scanner.nextInt();
            total = solvedproblems * i;
        }
        System.out.println("Total solved: " + total);
        double dailyAverage = total / days ;
        System.out.println("Daily average: " + dailyAverage);
        if (dailyAverage >= 5.0){
            System.out.println("Status: Consistent"  );
        }else if(dailyAverage < 5.0){
            System.out.println("Status: Needs consistency");
        }
        scanner.close();
    }
}
}
