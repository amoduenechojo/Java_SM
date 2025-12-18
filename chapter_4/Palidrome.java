public class Palidrome{
    public static void main(String [] args){
        int number =  12321;



        int result1 = number % 10;
        int result2 = (number / 10) % 100;
        int result3 = (number / 100); 
        int result4 = (number / 1000);
        int result5 = (number / 10000);
        int reversed = result1 * 10000 + result2 * 1000 + result3 * 100            + result4 * 10 + result5;

        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        if(reversed == number){
            System.out.println("Is palindrome");
        }
        else{System.out.println("Is not palindrome");}
    }
}
