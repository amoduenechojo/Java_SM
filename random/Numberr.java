import java.util.Scanner;
public class Numberr{
public static void main(String...args){
Scanner input = new Scanner(System.in);

System.out.println("Enter A Number");

while(true){
int number = input.nextInt();
for(int count = 1; number <= 5; count++){
if(count <= 5){
System.out.print("is a valid number");

}else{
System.out.print("i dont know this number");

}

}

}
}
}
