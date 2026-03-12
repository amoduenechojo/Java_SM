import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class CommonFactorsTest{

    @Test
        public static void testThatTwoIsACommonFactor(){
            int [] numbers = {5, 7, 6, 3, 2, 4};
		    commonFactors factor = new CommonFactor();
		    int expectedFactor = commonFactors.getCommonFactor(numbers);
		    int actualFactor = 2;
		    assertEquals(expectedFactor, actualFactor);
	    }
 }
