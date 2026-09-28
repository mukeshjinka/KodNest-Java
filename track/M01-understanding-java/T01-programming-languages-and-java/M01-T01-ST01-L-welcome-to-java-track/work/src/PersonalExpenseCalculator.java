
    import java.util.*;

public class PersonalExpenseCalculator { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double monthlyIncome = scan.nextDouble();
        double rentExpense = scan.nextDouble();
        double foodExpense = scan.nextDouble();
        double travelExpense = scan.nextDouble();
        
        double totalExpense = rentExpense + foodExpense + travelExpense;
        double remainingamount = monthlyIncome - totalExpense;
        
        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingamount);
        
        if (remainingamount >= 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }
    }
}
}
