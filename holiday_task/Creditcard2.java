import java.util.Scanner;
    public class Creditcard2{
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);

            String num = "54827079432025";
            creditCardValidityStatus(num);
       
            String num = "Visa card";
            CardType(number);
         }


        public static void creditCardDigitLength(String number){
            if (number.length() >= 13 && number.length() <= 16) {
 
                System.out.println("creditCardDigitLength: Valid ");}

            else{ 
                 System.out.println("creditCardDigitLength: Invalid" );
                    }
        }
       

        public static void CardType(String number){
            if(number.startsWith("4")){
            System.out.println("Credit card type: Visa card");}

            else if(number.startsWith("5")){
            System.out.println("Credit card type: Master card");}

            else if(number.startsWith("37")){
            System.out.println("Credit card type: American express card");}

            else if(number.startsWith("6")){
            System.out.println("Credit card type: Discover card");}

            else{
            System.out.println("Credit card type: Invalid");        
            }
        }
       
        
         public static void creditCardNumber(String card){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a card number");  
            int cardNumber = input.nextInt();
        }    


        public static int creditCardValidityStatus(String number){
            int sumEven = 0;
            int sumOdd = 0;
            
            for (int digit = 0; digit < number.length(); digit++) {

                System.out.println(digit);
                
                int evenNumber = number.charAt(digit) - 48;
                
                if (digit % 2 == 0)
                    evenNumber = evenNumber * 2;
                    sumEven += digit;
                    

                if (evenNumber > 9)
                       sumEven += (evenNumber - 9);
                else{
                       sumEven += evenNumber;
                    } 
            }
            return sumEven;
         }
        
           
    public static int creditCardValidityStatusOdd(String number){
        int sumOdd = 0;
        
        for(int digit = number.length() - 1; digit >= 0; digit--){
             if (digit % 2 != 0){
                int oddNumber = number.charAt(digit) - 48;
                System.out.println("Odd number " + oddNumber);
        
                sumOdd += oddNumber;
                
            }
                
                
        }

        return sumOdd;

      
    }
                                     
    public static String creditCardValidityStatusTotal(String number){
        int Even = creditCardValidityStatus(number);
        int Odd =  creditCardValidityStatusOdd(number);
     
        int total = Even + Odd;
         if(total %10 == 0){
            return "Credit card validity status:valid";
            } 
         else{
            return "Credit card validity status: Invalid";
            }
    }

//        System.out.println("Enter card number: ");
//        String number = input.nextLine();
//        
//        System.out.print(boolean isNumeric = true); 
//
//        for (char ene: number.toCharArray()){
//           if (!Character.isDigit(ene)) {
//
//            isNumeric = false;
//             break;
//            }
//
//            }
//
}

























    
     

    
