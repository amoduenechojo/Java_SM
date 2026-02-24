//public class SumOfAllDigits{
//    public static void main(String [] args){
//
//    int digit= 0;
//    int sum = 0;
//
//  
//    for(int number = 0; number < digit.length; number++){
//        if(digit(number) % 2 == 0){
//            sum += number;         
//        }
//    }
//System.out.println("Sum: " + sum);
//
//}
//    }
//
//




public class SumOfAllDigits {
    public static void main(String[] args) {

        int sum = 0;

        int[] digits = {2, 3, 4, 5, 6, 7, 98, 45, 100};

        for (int number = 0; number < digits.length; number++) {
            if (digits[number] % 2 == 0)
            sum += digits[number];
        }

        System.out.println("Sum: " + sum);

    }
}




//for (int i = 0; i < digits.length; i++) {
//    if (digits[i] % 2 == 0) {
//        sum += digits[i];
//    }
//}
