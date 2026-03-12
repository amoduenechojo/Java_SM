import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StatisticsAppTest{

    @Test
    public void testToCalculateSumOfMean(){
        
        double [] numbers = {2, 6, 8, 5};
        double expectedLength = 21;

        double actualLength = StatisticsApp.calculateSumOfMean(numbers);
        assertEquals(expectedLength, actualLength);
    }


    @Test
    public void testToCalculateMean(){
        
        double [] numbers = {2, 6, 8, 5};
        double expectedLength = 5.25;

        double actualLength = StatisticsApp.calculateMean(numbers);
        assertEquals(expectedLength, actualLength);
    }


    @Test
    public void testToCalculateTheDifferenceOfMean(){

     double [] numbers = {2, 6, 8, 5};
     double [] expectedLength = {-3.25, 0.75, 2.75, -0.25};

        double [] actualLength = StatisticsApp.calculateTheDifferenceOfMean(numbers);
        assertArrayEquals(expectedLength, actualLength);

    }


    @Test
    public void testToCalculateTheSquareDifferenceOfMean(){

        double [] numbers ={2, 6, 8, 5};
        double [] expectedLength = {10.5625, 0.5625, 7.5625, 0.0625};

        double [] actualLength = StatisticsApp.calculateTheSquareDifferenceOfMean(numbers);
        assertArrayEquals(expectedLength, actualLength);

    }

    
    @Test
    public void testSumOfSquareDifference(){

        double [] numbers = {2, 6, 8, 5};
        double  expectedLength = 18.75;

        double actualLength = StatisticsApp.sumOfSqaredDifference(numbers);
        assertEquals(expectedLength, actualLength);
    }



    @Test
     public void testToFindTheVarience(){

        double [] numbers = {2, 6, 8, 5};
        double  expectedLength = 4.6875;

        double  actualLength = StatisticsApp.varience(numbers);
        assertEquals(expectedLength, actualLength);
    }


     @Test
        public void testToFindTheStandardDeviation(){

            double[] numbers = {2, 6, 8, 5};
            double expectedLength = 2.17;

            double actualLength = StatisticsApp.standardDeviation(numbers);

            assertEquals(expectedLength, actualLength);
        }






















}




