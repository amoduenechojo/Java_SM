import java.util.Scanner;

public class Tax{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i <= 3; ++i){
        
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter earnings: ");
        int earnings = input.nextInt();

//15/100== 0.15
//20/100 = 0.2


       double tax;
        if (earnings <= 30000) {
        tax = earnings * 0.15;
        }else{ 
            tax = 30000 * 0.15 + (earnings - 30000) + 0.2;
        
        }
            System.out.println(name + "'s tax: $" + tax);
            }
    }
}
