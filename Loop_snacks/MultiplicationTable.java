import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);     


        System.out.print("Enter the number for the multiplication table: ");
        int number = input.nextInt();
                 

           for(int count = 1; count <= 10; count++){
            System.out.printf("%d x %d = %d\n", number,count, number * count);

        
      } 
    }
}
