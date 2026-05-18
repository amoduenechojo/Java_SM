public class Request {

    private Destination floor;
    private Direction direction;

    public void setFloor(Destination floor) {
        this.floor = floor;
    }

    public Destination getFloor() {
        return floor;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}