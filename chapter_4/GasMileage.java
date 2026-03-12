import java.util.Scanner;

public class GasMileage{
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int milesDriven = 0;
    int fuelGallonUsed = 0;

    double totalMilesDriven = 0;
    double totalFuelGallonUsed = 0;

while( milesDriven != -1){
    System.out.print("Enter the miles driven: ");
    milesDriven = input.nextInt();

    System.out.print("Enter the gallon of fuel you buy: ");
    fuelGallonUsed = input.nextInt();


    double milesPerGallon = (double)milesDriven / fuelGallonUsed;
    System.out.println("The miles per gallon used for each trip is: " + milesPerGallon);

//print the combined miles per gallon obtained for all trips up to this point

    totalMilesDriven = totalMilesDriven + milesDriven;
    totalFuelGallonUsed = totalFuelGallonUsed + fuelGallonUsed;

    double combinedMilesPerGallon = totalMilesDriven / totalFuelGallonUsed;
    System.out.println("The combined miles per gallon: " + combinedMilesPerGallon);
}


}
    }
