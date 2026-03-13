public class PredicateFunction{
    public static boolean [] numberCheck(int [] numbers){

        boolean [] updatedNumbers = new boolean [numbers.length];

            for(int index = 0; index < numbers.length; index ++){
                if(numbers[index] % 2 == 0){
                    updatedNumbers[index] = true;
                 }
                
                else{
                    updatedNumbers[index] = false;
                }
            }
        return updatedNumbers;
    }
}



    public static int [] multiplyByTwo(int [] numbers){
    
        int [] newArray = new int [numbers.length];

            for(int index = 0; index < numbers.length; index++){
                newArray[index] = numbers.length;
       
            }
    }
