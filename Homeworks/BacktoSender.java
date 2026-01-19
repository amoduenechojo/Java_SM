import java.util.Scanner;
    public class BacktoSender{
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);
 
        System.out.print("Enter your successful deliveries: ");
        int deliveries = input.nextInt();
        
        while (deliveries < 0 || deliveries > 100){
        System.out.print("Re-enter a valid input: ");
        deliveries = input.nextInt();
        }


        int basePay = 5000;
        int amountParcel = 0;
      
        if (deliveries < 50){
            amountParcel = 160;
        }

        else if(deliveries >= 50 && deliveries <= 59){
            amountParcel = 200;
        }

        else if(deliveries >= 60 && deliveries <= 69){
            amountParcel = 250;
        }

        else if (deliveries >= 70){
            amountParcel = 500;
        }

        else{
            System.out.print("Invalid delivery rate.");}
            

        int wageForTheDay = deliveries * amountParcel + 5000;
        System.out.println("The riders wage is: " + wageForTheDay);
}
}
