public class RightTriangle{
    public static void main(String [] args){

        int row = 5;
        for(int rowIndex = 1; rowIndex <= row; rowIndex++){
            for(int columnCount = row - rowIndex; columnCount >= rowIndex; columnCount++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
