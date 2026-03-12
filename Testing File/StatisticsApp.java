public class StatisticsApp{

//        public static void main(String [] args){
//
//         double [] numbers = {10.5625, 0.5625, 7.5625, 0.0625};
//         double result = sumOfSquareDifference(numbers);
//        
//            System.out.println(result);
//        }
        


        public static double calculateSumOfMean(double [] numbers){  
            double calculateSumOfMean = 0;
                for(int count = 0; count < numbers.length;count++){
                     calculateSumOfMean += numbers[count]; 
                }
        return calculateSumOfMean;
        }

        public static double calculateMean(double [] numbers){
           double calculateSumOfMean = 0;
                for(int count = 0; count < numbers.length; count++){
                    calculateSumOfMean += numbers[count];
                 }

         return calculateSumOfMean / numbers.length;
    }

            public static double [] calculateTheDifferenceOfMean(double[] numbers){

                double mean = calculateMean(numbers); 
                double [] differences = new double[numbers.length];

                    for(int count = 0; count < numbers.length; count++){ 
                        differences[count] = numbers[count] - mean;
            }

        return differences;  
   }


        public static double [] calculateTheSquareDifferenceOfMean(double[] numbers){
        
            double [] meanDifference = calculateTheDifferenceOfMean(numbers); 
                for(int count = 0; count < numbers.length; count++){

                    meanDifference[count] = meanDifference[count] * meanDifference[count];
                }
        return meanDifference;  
        }



        public static double  sumOfSqaredDifference(double [] numbers){

            double [] squareDifference = calculateTheSquareDifferenceOfMean(numbers);
            double sum = 0;

                for(int index = 0; index < squareDifference.length; index++){
                    
                    sum += squareDifference[index];
                }

            return sum;
      }


         public static double varience(double[] numbers) {

            double[] squareDifferences = calculateTheSquareDifferenceOfMean(numbers);

            double sum = 0;

                for (int count = 0; count < squareDifferences.length; count++) {
                    sum += squareDifferences[count];
                }

                    double variance = sum / squareDifferences.length;

            return variance;
        }
 
        
       public static double standardDeviation(double[] numbers) {

            double varience = Math.sqrt(varience(numbers));

            double standardDeviation = (int)(varience * 100 + 0.5);
            standardDeviation = standardDeviation/100;

            return standardDeviation;
        }

}
