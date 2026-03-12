import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BackToSenderTest{

    @Test
    public void testCalculateWageForLessThan50Deliveries() {
        int expectedWage = 9800; 
        int actualWage = BackToSender.calculateWage(30);
        assertEquals(expectedWage, actualWage);
    }

    @Test
    public void testCalculateWageFor50To59Deliveries() {
        int expectedWage = 15000;
        int actualWage = BackToSender.calculateWage(50);
        assertEquals(expectedWage, actualWage);
    }


    @Test
    public void testCalculateWageFor60To69Deliveries() {
        int expectedWage = 21250; 
        int actualWage = BackToSender.calculateWage(65);
        assertEquals(expectedWage, actualWage);
    }


    @Test
    public void testCalculateWageFor70OrMoreDeliveries() {
        int expectedWage = 40000; 
        int actualWage = BackToSender.calculateWage(70);
        assertEquals(expectedWage, actualWage);
    }
}
