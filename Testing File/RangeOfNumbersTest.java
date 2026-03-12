import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RangeOfNumbersTest{

    @Test
        public void testNumberMovesFromLargestToLowest(){

        int [] numbers = {2, 5, 7, 1, 6, 9};

        int [] expectedNumber = {9, 7, 6, 5, 2, 1};

        int [] actualNumber = RangeOfNumbers.fromLargestToLowest(numbers);
        assertArrayEquals(actualNumber, expectedNumber);
    }


    @Test
        public void testForSecondLargestNumber(){

        int [] numbers = {2,5,7,1,6,9};

        int expectedNumber = 7;

        int actualNumber = RangeOfNumbers.getSecondLargestNumber(numbers);
        assertEquals(actualNumber, expectedNumber);
    }


//        @Test 
//            public void testForTheSecondLowestNumber(){
//
//            int [] numbers = {2,5,7,1,6,9};
//            int expectedNumber = 2;
//
//            double actualNumber = RangeOfNumbers.getSecondLowestNumber(numbers);
//            assertEquals(expectedNumber, actualNumber);
//    }




//        }   
}
