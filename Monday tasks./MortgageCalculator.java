import java.util.Scanner;
    public class MortgageCalculator{   
         public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the amount of principal you borrowed: ");
            double principal = input.nextDouble();

//            
//            System.out.print("Enter the interest in percentage: ");
//            double interest = input.nextDouble();
//            double interestRate = interest * (100/12);


//                M = P (r(1 + r)^n)/(1 + r)^n-1);

             
            System.out.print("Enter years: ");
            double years = input.nextDouble();
//            double howLong = years * 12;

            System.out.printf("INTEREST RATE \t\t\t MONTHLY PAYMENT  \t\t\t TOTAL PAYMENT");



           for(double count= 5.0; count <= 10.0; count += 0.25){
            
            double interestRate = count/(100*12);
            System.out.println(count);

            double monthlyPayment = (principal * (interestRate * Math.pow(1 + interestRate, years * 12)))/ Math.pow(1 + interestRate, years * 12) - 1;

            double totalPayment = monthlyPayment * interestRate;

            System.out.printf("%.3f \t %.2f \t %.2f\n" , interestRate,monthlyPayment, totalPayment);
            }


 }
        }    
            
