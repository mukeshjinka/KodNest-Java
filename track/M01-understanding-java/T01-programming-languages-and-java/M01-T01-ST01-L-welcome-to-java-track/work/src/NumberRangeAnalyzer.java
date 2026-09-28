
    import java.util.Scanner;
public class NumberRangeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        for(;start <= end ; start++){
            if (start % 2 == 0){
                sum = start + sum;
            }else {
                count = count + 1;
            }
        }
        
        System.out.println("Even sum: " + sum);
        System.out.println("Odd count: " + count);
        scanner.close();
    }
}