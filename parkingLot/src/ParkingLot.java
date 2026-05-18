public class ParkingLot {

    public static int[] parkingLotSlot() {
        return new int[20];
    }


    public static String parkAtSlot(int[] parkingSpace, int slotNumber) {
        if (slotNumber < 1 || slotNumber > parkingSpace.length) {
            return "Invalid input.";
        }

        if (parkingSpace[slotNumber - 1] == 0) {
            parkingSpace[slotNumber - 1] = 1;
            return "Car parked at slot " + slotNumber;
        } else {
            return "Slot already occupied.";
        }
    }


    public static String carsParkedLeavingSlot(int slotNumber, int[] parkingSpace) {
        if (slotNumber < 1 || slotNumber > parkingSpace.length) {
            return "Invalid input.";
        }

        if (parkingSpace[slotNumber - 1] == 1) {
            parkingSpace[slotNumber - 1] = 0;
            return "Car removed from slot " + slotNumber;
        } else {
            return "Slot is already empty";
        }
    }
}