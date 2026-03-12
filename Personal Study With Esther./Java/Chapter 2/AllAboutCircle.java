import java.util.Scanner;
public class AllAboutCircle{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int RadiusOfACircle  = input.nextInt();

        System.out.printf("The diameter is: %d%n", 2 * RadiusOfACircle);

        System.out.printf("The circumference of the circle is: %d%n", 2 * Math.PI * RadiusOfACircle;);

        System.out.printf("The area of the circle is: %d", Math.PI * RadiusOfACircle *  RadiusOfACircle);
