import java.util.Scanner;

public class TaxCalculator{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
        for(int index = 1; index <= 3; index++){
        
        System.out.print("Enter a name: ");
        String citizensName = input.nextLine();

        System.out.print("Enter earnings: ");
        double earnings = input.nextInt();

        if (earnings <= 30000) {
        double tax = earnings * 0.15;
        }
   
//Tax=1 5% of first 30000 + 20% * amount above 30000     
        else{ 
            double tax = (30000 * 0.15) + ((earnings - 30000) * 0.20);
        
        }
            System.out.println(citizensName + "tax: $" + tax);
            }
    }

}
