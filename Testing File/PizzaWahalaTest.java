import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaWahalaTest{


    @Test
    public void testThatTheBuyerBoughtFourPizzaPackOfTheSapaSize(){
        int expectedWage = 9800; 
        int actualWage = PizzaWahala.calculateAmountForSapaSize(4);
        assertEquals(expectedWage, actualWage);
    }

     @Test
    public void testThatTheBuyerBoughtTwoPizzaPackOfTheSmallMoney(){
        int expectedWage = 1000; 
        int actualWage = PizzaWahala.calculateAmountForSmallMoney(6);
        assertEquals(expectedWage, actualWage);
    }


     @Test
    public void testThatTheBuyerBoughtFourPizzaPackOfTheBigBoys(){
        int expectedWage = 1200; 
        int actualWage = PizzaWahala.calculateAmountForBigBoys(8);
        assertEquals(expectedWage, actualWage);
    }


     @Test
    public void testThatTheBuyerBoughtFourPizzaPackOfTheOdogwu(){
        int expectedWage = 1400; 
        int actualWage = PizzaWahala.calculateAmountForOdogwu(12);
        assertEquals(expectedWage, actualWage);
    }




}
