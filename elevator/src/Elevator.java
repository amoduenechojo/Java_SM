import java.util.ArrayList;
import java.util.List;

public class Elevator {

    private int count = 0;
    private Destination currentFloor = Destination.GROUNDFLOOR;
    private List<Request> requests = new ArrayList<>();


    public boolean isEmpty() {
        return count == 0;
    }


    public boolean moveUp() {

        switch(currentFloor) {

            case GROUNDFLOOR->
                currentFloor = Destination.FLOOR1;

            case FLOOR1->
                currentFloor = Destination.FLOOR2;

            case FLOOR2->
                currentFloor = Destination.FLOOR3;

            case FLOOR3->
                currentFloor = Destination.FLOOR4;

            case FLOOR4->{
                return false;
            }
        }

        return true;
    }



    public Destination getCurrentFloor() {
        return currentFloor;
    }


    public Destination requestFloor(Destination floor) {

        while(currentFloor != floor) {

            if(currentFloor == Destination.GROUNDFLOOR) {
                moveUp();
            }

            else if(currentFloor == Destination.FLOOR1) {
                moveUp();

                if(floor == Destination.GROUNDFLOOR) {
                    moveDown();
                }
                else {
                    moveUp();
                }
            }

            else if(currentFloor == Destination.FLOOR2) {

                if(floor == Destination.GROUNDFLOOR || floor == Destination.FLOOR1) {

                    moveDown();
                }
                else {
                    moveUp();
                }
            }

            else if(currentFloor == Destination.FLOOR3) {

                if(floor == Destination.FLOOR4) {
                    moveUp();
                }
                else {
                    moveDown();
                }
            }

            else if(currentFloor == Destination.FLOOR4) {
                moveDown();
            }
        }
        return Destination;
    }



    public boolean moveDown() {

        switch (currentFloor) {

            case FLOOR4 -> currentFloor = Destination.FLOOR1;

            case FLOOR3 -> currentFloor = Destination.FLOOR2;

            case FLOOR2 -> currentFloor = Destination.FLOOR3;

            case FLOOR1 -> currentFloor = Destination.FLOOR4;

            case GROUNDFLOOR -> {
                return false;
            }

        }
        return true;
    }



    public boolean isIdle() {
        return requests.isEmpty();
    }

    public List<Request> getAllRequests() {
        return requests;

    }


    public void addRequest(Request request) {
            if(requests == null){
                throw new IllegalArgumentException();
            }

     requests.add(request);
    }


    public void move(){
        for(Request request : requests){
            currentFloor = request.getFloor();
        }
    }

}

