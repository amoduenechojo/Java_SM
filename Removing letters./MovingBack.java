public class MovingBack{
    public static void main(String [] args){

int count = 5; 

    for(int number = 1; number <= count; number ++){
            for(int counter = count - number; counter >= 1; counter --){
                System.out.print(" ");
            }

                for(int value = number; value >= 1; value --){
                System.out.print(value);
                }
        System.out.println();
        } 
    }
}
