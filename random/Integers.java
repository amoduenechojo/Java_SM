import java.util.Scanner;
public class Integers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

         System.out.println ("Enter first number ");
         int firstNumber = input.nextInt();

         System.out.println ("Enter second number ");
         int secondNumber = input.nextInt();

         System.out.println ("Enter third number ");
         int thirdNumber = input.nextInt();

         int sum = firstNumber + secondNumber + thirdNumber;
         System.out.println("sum: " + sum);

         int average = sum/3;
         System.out.println("average:" + average);
                        
         int product = firstNumber * secondNumber * thirdNumber;
         System.out.println("product:" + product);                  
                        
         int smallestNumber = firstNumber;
         
            if (secondNumber < smallestNumber){
            secondNumber = smallestNumber;
 }
              
            else if(thirdNumber < smallestNumber);{
            thirdNumber = smallestNumber;
}
            
             System.out.println("The smallest number is:" + smallestNumber);


         largestNumber = secondNumber;


       if (firstNumber > largestNumber); {
 }       largestNumber = firstNumber;
         else if (thirdNumber > largestNumber){
        largestNumber = thirdNumber;
}
        System.out.print("The largest number is:" + largestNumber);

                               
  }


   }
                            
