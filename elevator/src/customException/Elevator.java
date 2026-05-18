package customException;

public class Elevator extends RuntimeException {
    public Elevator(String message) {
        super(message);
    }
}
