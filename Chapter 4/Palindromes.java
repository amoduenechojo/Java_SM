public class Palindromes{
    public static void main(String [] args){
        int number =  12321;



        int result1 = number % 10;
        int result2 = (number / 10) % 10;
        int result3 = (number / 100)% 10; 
        int result4 = (number / 1000)% 10;
        int result5 = (number / 10000)% 10;
        int reversed =(result1 * 10000) + (result2 * 1000) + (result3 * 100) +( result4 * 10) + result5;

        
        System.out.println("Original: " + number);
        System.out.println("Reversed: " + reversed);
       

        if(reversed == number){
            System.out.println("Is palindrome");
        }
        else{System.out.println("Is not palindrome");}
    }
}
