import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BacktoSenderTest {

    @Test
    void testDeliveriesBelow50() {
        int wage = BacktoSender.calculateWage(10);
        assertEquals(6600, wage);
    }

    @Test
    void testBoundary49Deliveries() {
        int wage = BacktoSender.calculateWage(49);
        assertEquals(12840, wage);
    }

    @Test
    void testDeliveriesBetween50And59() {
        int wage = BacktoSender.calculateWage(50);
        assertEquals(15000, wage);
    }

    @Test
    void testBoundary59Deliveries() {
        int wage = BacktoSender.calculateWage(59);
        assertEquals(16800, wage);
    }

    @Test
    void testDeliveriesBetween60And69() {
        int wage = BacktoSender.calculateWage(60);
        assertEquals(20000, wage);
    }

    @Test
    void testBoundary69Deliveries() {
        int wage = BacktoSender.calculateWage(69); 
        assertEquals(22250, wage);
    }

    @Test
    void testDeliveries70AndAbove() {
        int wage = BacktoSender.calculateWage(70);
        assertEquals(40000, wage);
    }

    @Test
    void testMaximumDeliveries() {
        int wage = BacktoSender.calculateWage(100);
        assertEquals(55000, wage);
    }
}








javac -cp .;junit-platform-console-standalone-1.10.0.jar BacktoSender.java BacktoSenderTest.java


