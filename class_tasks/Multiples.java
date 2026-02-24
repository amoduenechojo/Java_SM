public class Multiples{
    public static void main(String [] args){

    for(int number = 100; number <= 200; number ++){
   
    if(number % 4 == 0 && number % 6 == 0){
    System.out.println("\"Hello World\"");
    }

    if(number % 4 == 0){
    System.out.println("\"Hello\"");
    }

//    else if(number % 4 !=0){
//    System.out.println("");
//    }
//
    else if(number % 6 == 0){
    System.out.println("\"World\"");
    }

    else{
    System.out.println(number);
    }
//    if(number % 4 == 0 && number % 6 == 0){
//    System.out.println("\"Hello World\"");
//    }
}

}
    }

