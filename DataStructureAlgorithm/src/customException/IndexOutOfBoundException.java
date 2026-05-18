package customException;

public class IndexOutOfBoundException extends RuntimeException {
    public IndexOutOfBoundException(String message) {
        super(message);
    }
}
