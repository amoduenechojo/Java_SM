import java.util.Scanner;

public class Creditcard2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String number = input.nextLine();

        creditCardDigitLength(number);
        CardType(number);
        System.out.println(creditCardValidityStatusTotal(number));
    }

  
    public static void creditCardDigitLength(String number) {
        if (number.length() >= 13 && number.length() <= 16) {
            System.out.println("Credit card digit length: Valid");
        } else {
            System.out.println("Credit card digit length: Invalid");
        }
    }

  
    public static void CardType(String number) {

        if (number.startsWith("4")) {
            System.out.println("Credit card type: Visa Card");
        } 
        else if (number.startsWith("5")) {
            System.out.println("Credit card type: MasterCard");
        } 
        else if (number.startsWith("37")) {
            System.out.println("Credit card type: American Express");
        } 
        else if (number.startsWith("6")) {
            System.out.println("Credit card type: Discover Card");
        } 
        else {
            System.out.println("Credit card type: Invalid");
        }
    }

   
    public static int creditCardValidityStatus(String number) {

        int sumEven = 0;

        for (int i = number.length() - 2; i >= 0; i = i - 2) {

            int digit = number.charAt(i) - '0';
            digit = digit * 2;

            if (digit > 9) {
                digit = digit - 9;
            }

            sumEven = sumEven + digit;
        }

        return sumEven;
    }

   
    public static int creditCardValidityStatusOdd(String number) {

        int sumOdd = 0;

        for (int i = number.length() - 2; i >= 0; i = i - 2) {
            int digit = number.charAt(i) - '0';
            
            sumOdd = sumOdd + digit;
        }

        return sumOdd;
    }

    
    public static String creditCardValidityStatusTotal(String number) {

        int even = creditCardValidityStatus(number);
        int odd = creditCardValidityStatusOdd(number);
        
        int total = even + odd;

        if (total % 10 == 0) {
            return "Credit card validity status: Valid";
        } else {
            return "Credit card validity status: Invalid";
        }
    }
}

