public class CalculateSimpleIntrest {
    public static void main(String[] args) {
    double Principal = 10000.0;
double rate = 6.5;
double time = 2.0;
double weight = 72.0;
double height = 1.8;
double simpleInterest = (Principal*rate*time)/100.0;
double totalAmount = Principal + simpleInterest;
double bmi = weight/(height*height);
int totalmarks=78+84+69+91+88;
double percentage = (totalmarks * 100.0)/500;
System.out.println("Simple Interest: "+simpleInterest);
System.out.println("Total Amount: "+totalAmount);
System.out.println("BMI: "+bmi);
System.out.println("Total Marks: "+totalmarks);
System.out.println("Percentage: "+percentage);   
}
}