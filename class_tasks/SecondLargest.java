import java.util.Scanner;
public class SecondLargest{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

            double [] numbers = new double [5];
        
            
            double firstNumber = 0;
            double secondNumber = 0;
            double thirdNumber = 0;

    for(double count = 0; count < 5; count++){


            System.out.println("Enter a number: ");
            firstNumber = input.nextInt();

  }
                for(int index = 0; index <= numbers.length; index++){

 
                    if (firstNumber > secondNumber){
                        System.out.println("The largest number is: " + firstNumber);
                        }
               
                        else if(secondNumber < thirdNumber){
                            System.out.println("The second largest is: " + secondNumber);
                            }


                }




















    }
}
