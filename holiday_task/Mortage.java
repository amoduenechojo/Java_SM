import java.util.Scanner;
    public class Mortgage{   
         public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the amount of money borrowed: ");
            double money = input.nextDouble();

            
            System.out.println("Enter the interest in percentage: ");
            double interest = input.nextDouble();
            double monthlyInterest = interest/100/12;

            
            System.out.println("Enter loan longetivity: ");
            double longetivity = input.nextDouble();
            double monthlylongetivity = longetivity * 12;



            double base = 1 + monthlyInterest;
            double power = Math.pow(base, months);

            double numerator = monthlyInterest * power;
            double denominator = power - 1;

            double monthlyPayment = money * (numerator / denominator);

            
           System.out.println("Monthly mortgage payment: " + monthlyPayment);


 }
        }

