import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class AirConditionerTest{
   
   @Test
        public void testThatAirConditionersOff(){


        AirConditioner myAC = new AirConditioner();

        boolean expectedValue = true;
        boolean actualValue = myAC.ACStatus;
      
        assertEquals(expectedValue, actualValue);
        }


    @Test
        public void testThatAirConditionerIsOn(){

        AirConditioner myAC = new AirConditioner();

        boolean expectedValue = true;
        boolean actualValue = myAC.turnOn();

    
        assertEquals(expectedValue, actualValue);
        }


    @Test
        public void testForIncreaseInTemperature(){

        AirConditioner myAC = new AirConditioner();

        int expectedValue = 18;
        int actualValue = myAC.increaseInTemperature();
    
        assertEquals(actualValue, expectedValue);
    }



     @Test
        public void testForDecreaseInTemperature(){

        AirConditioner myAC = new AirConditioner();

        int expectedValue = 16;
        int actualValue = myAC.decreaseInTemperature();
    
        assertEquals(actualValue, expectedValue);
    }


    @Test
        public void testFixedIncreaseInTemperature(){

        AirConditioner myAC = new AirConditioner();

        int expectedValue = 30;
        int actualValue = myAC.fixedIncreaseInTemperature();
    
        assertEquals(actualValue, expectedValue);
    }


    
    
    @Test
        public void testFixedIncreaseInTemperature(){

        AirConditioner myAC = new AirConditioner();

        int expectedValue = 16;
        int actualValue = myAC.fixedDecreaseInTemperature();
    
        assertEquals(actualValue, expectedValue);
    }



     @Test
        public void testThatIGotTheTemperature(){

        AirConditioner myAC = new AirConditioner();

        int expectedValue = 16;
        int actualValue = myAC.fixedDecreaseInTemperature();
    
        assertEquals(actualValue, expectedValue);
    }











}

