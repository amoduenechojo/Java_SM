import java.util.Scanner;

    public class  GuessGame{
        public static void main(String [] args){

            Scanner input = new Scanner(System.in);

        int secret = 18;
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

            while(number != -1){

                if(number < secret){
                    System.out.println("Too low! Try again.");
                    number = input.nextInt();
                    
                }

                else if(number  > secret){
                        System.out.println("Too high! Try again.");
                        number = input.nextInt();
                    
                    }

                else{
                    System.out.println("You guessed right!");
                        break;
                }

























    
}

















    }
}
