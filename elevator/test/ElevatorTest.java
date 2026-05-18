import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElevatorTest {

    public Elevator myElevator;

    @BeforeEach
    void setUp() {
        myElevator = new Elevator();

    }



    @Test
    public void testThatElevatorExists() {

        assertNotNull(myElevator);
    }



    @Test
    public void testThatElevatorIsEmpty() {

        assertTrue(myElevator.isEmpty());
    }


    @Test
    public void testThatWhenElevatorIsNewlyCreated_elevatorIsAtTheGroundFloor(){

        assertEquals(Destination.GROUNDFLOOR, myElevator.getCurrentFloor());
    }


    @Test
    public void testThatWhenElevatorIsNewlyCreated_directionShouldBeIdle(){

        assertEquals(Direction.IDLE, myElevator.getCurrentFloor());
    }


    @Test
    public void testThatWhenElevatorHasNoRequest_requestListShouldBeEmpty(){

        myElevator.getAllRequests();
        assertTrue(myElevator.isEmpty());
    }


    @Test
    public void testThatElevatorCanMoveUp() {

        assertTrue(myElevator.moveUp());
    }



    @Test
    public void testThatElevatorCanMoveDown() {

        assertTrue(myElevator.moveDown());

    }


    @Test
    public void elevatorIsIdleOnCreation() {

        assertTrue(myElevator.isIdle());

    }


    @Test
    public void elevatorIsNotIdleWhenARequestIsMade() {

        Request request = new Request();

        request.setFloor(Destination.FLOOR4);
        request.setDirection(Direction.UP);

        myElevator.addRequest(request);

        assertFalse(myElevator.isIdle());

    }


    @Test
    public void elevatorIsOnTheGroundFloor_aRequestIsMadeToFloorFour_elevatorMovesToFloorFour() {

        assertEquals(0, myElevator.getCurrentFloor());

        myElevator.requestFloor();
        assertEquals(Destination.FLOOR4, myElevator.getCurrentFloor());
    }


    @Test
    public void elevatorIsAtFloorFour_aRequestIsMadeToFloorTwo_elevatorMovesToFloorTwo() {

        myElevator.requestFloor(Destination.FLOOR4);

        myElevator.requestFloor(Destination.FLOOR2);

        assertEquals(Destination.FLOOR2, myElevator.getCurrentFloor());
    }


    @Test
    public void testThatElevatorIsAtFloorFour_aRequestIsMadeAtFloor3andFloor2_elevatorMovesDownAndStopsAtFloor3ThenFloor2(){

        myElevator.getCurrentFloor(Destination.FLOOR4);

        myElevator.requestFloor(Destination.FLOOR3);
        myElevator.requestFloor(Destination.FLOOR2);

        assertEquals(Destination.FLOOR2, myElevator.getCurrentFloor());
    }




}
