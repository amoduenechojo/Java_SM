public class AverageOfNumbers{
    public static void main(String [] args){

        int sum = 0;

        for(int number = 1; number <= 100; number ++){
            sum = sum + number;    
        }
            System.out.println("The sum: " + sum);


        double average = sum/100;
        System.out.println("The average: " + average);

}
    }       

