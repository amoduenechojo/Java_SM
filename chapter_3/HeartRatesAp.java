import java.util.Scanner;

public class HeartRatesApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Birth Month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter Birth Day: ");
        int day = input.nextInt();

        System.out.print("Enter Birth Year: ");
        int year = input.nextInt();

     
        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        
        System.out.println("\n--- Person Information ---");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + 
                person.getBirthMonth() + "/" +
                person.getBirthDay() + "/" +
                person.getBirthYear());

        System.out.println("Age: " + person.getAge() + " years");
        System.out.println("Maximum Heart Rate: " + 
                person.getMaximumHeartRate() + " beats per minute");
        System.out.println("Target Heart Rate Range: " + 
                person.getTargetHeartRate());

    }
}

