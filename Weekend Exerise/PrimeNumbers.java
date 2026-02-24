//import java.util.Scanner;
//public class PrimeNumbers{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        for(int number = 2; int number <= 100; number++){
//            for(int count = 2; int count <= number; count++){
//                if(number % count == 0){
//                    break;
//                }
//                    else{
//                    System.out.println(number);
//
//                    }
//            }
//
//
//
//
//
//
//        }
//}
//    }

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int number = 2; number <= 100; number++) {

            int count;
            for (count = 2; count <= number; count++) {
                if (number % count == 0) {
                    break;
                }
            }

            if (count > number) {
                System.out.println(number);
            }
        }
    }
}















//}
