import java.util.Scanner;
public class Shapes{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
        System.out.println("double base");
        double base = 5;

        System.out.println("double height");
        double height = 10;

        System.out.println("double triangleArea");
        double triangleArea = (0.5 * base * height);

        System.out.printf("triangleArea is %f",triangleArea);
                    
    }
}		

