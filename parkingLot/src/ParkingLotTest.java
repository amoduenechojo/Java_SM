import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    @Test
    public void testThatParkingLotHasTwentySlots() {
        int[] actual = ParkingLot.parkingLotSlot();
        assertEquals(20, actual.length);
    }

    @Test
    public void testThatCarCanParkInEmptySlot() {
        int[] parkingSpace = new int[20];
        String result = ParkingLot.parkAtSlot(parkingSpace, 5);

        assertEquals("Car parked at slot 5", result);
        assertEquals(1, parkingSpace[4]);
    }

    @Test
    public void testThatCarCannotParkInOccupiedSlot() {
        int[] parkingSpace = new int[20];
        ParkingLot.parkAtSlot(parkingSpace, 1);

        String result = ParkingLot.parkAtSlot(parkingSpace, 1);
        assertEquals("Slot already occupied.", result);
    }

    @Test
    public void testThatCarHasLeftParkingLot() {
        int[] parkingSpace = new int[20];
        parkingSpace[0] = 1;
        String result = ParkingLot.carsParkedLeavingSlot(1, parkingSpace);
        assertEquals("Car removed from slot 1", result);
        assertEquals(0, parkingSpace[0]);
    }

    @Test
    public void testThatEmptySlotCannotBeRemoved() {
        int[] parkingSpace = new int[20];
        String result = ParkingLot.carsParkedLeavingSlot(5, parkingSpace);

        assertEquals("Slot is already empty", result);
    }
}