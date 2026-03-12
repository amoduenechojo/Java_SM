import java.util.Scanner;
public class ConversionToFahrenheit{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

//    for(int index = 1; index <= 5; index++){        

        System.out.print("Enter a temperature in celsius: ");
        int celsiusTemperature = input.nextInt();

        for(int index = 1; index <= 5; index++){    

        if(celsiusTemperature >= -273){
            int formulaOfFahrenheit = (celsiusTemperature * 9/5) + 32;
            celsiusTemperature = celsiusTemperature + index;


            System.out.println("Temperature: " + celsiusTemperature);
            System.out.println(formulaOfFahrenheit);
        
//            celsiusTemperature = celsiusTemperature + index;
        }
 
        else{
            System.out.println("Try again!");
            }
    }










    }
}
