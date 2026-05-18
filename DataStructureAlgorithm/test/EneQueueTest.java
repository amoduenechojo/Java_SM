import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EneQueueTest {

    @Test
    public void testThatQueueExists(){

        EneQueue queue = new EneQueue();

        assertNotNull(queue);
    }


    @Test
    public void testThatQueueIsEmpty(){

        EneQueue queue = new EneQueue();
        assertTrue(queue.isEmpty());

        assertEquals(0, queue.getSizeOfQueue());
    }


    @Test
    public void testThatWhenQueueIsEmpty_elementCanBeAdded(){
        EneQueue queue = new EneQueue();
        queue.isEmpty();

        assertTrue(queue.Enqueue("Return her phone."));
    }


    @Test
    public void testThatWhenQueueIsEmpty_elementCanBeAdded_sizeOfQueueIncreases(){

        EneQueue queue = new EneQueue();
        queue.isEmpty();

        assertTrue(queue.Enqueue("Everything love."));
        assertEquals(1, queue.getSizeOfQueue());
    }


    @Test
    public void testThatOfferAddsElementToQueue() {

        EneQueue queue = new EneQueue();

        assertTrue(queue.offerQueue("B"));
        assertEquals(1, queue.getSizeOfQueue());
    }

    @Test
    public void testThatWhenQueueIsEmpty_duplicateElementAreAdded_sizeOfQueueIsIncreased(){

        EneQueue queue = new EneQueue();
        queue.isEmpty();

        queue.Enqueue("Daniel");
        queue.Enqueue("Eneojo");
        queue.Enqueue("Eneojo");

        assertEquals(3, queue.getSizeOfQueue());
    }

    @Test
    public void testThatWhenAQueueIsEmpty_elementCanBeAdded_andOfferedAtTheSameTime_sizeIncreases(){

        EneQueue queue = new EneQueue();

        queue.isEmpty();
        queue.Enqueue("Readability.");

        assertTrue(queue.offerQueue("Habit"));
        assertEquals(2, queue.getSizeOfQueue());
    }


    @Test
    public void testThatQueueHasTwoElements_peekIsCalled_theFirstElementIsReturned(){

        EneQueue queue = new EneQueue();

        queue.Enqueue("Ejura");
        queue.Enqueue("Loves Ocheja");


        assertEquals("Ejura",queue.peekIntoQueue());

        assertEquals(2, queue.getSizeOfQueue());

    }

    @Test
    public void testPeekOnEmptyQueue_returnsNull(){

        EneQueue queue = new EneQueue();

        assertNull(queue.peekIntoQueue());
    }

    @Test
    public void testThatPeekReturns_frontElementWithoutRemovingIt() {

        EneQueue queue = new EneQueue();

        queue.Enqueue("Orange");
        queue.Enqueue("Watermelon");

        assertEquals("Orange", queue.peekIntoQueue());
        assertEquals(2, queue.getSizeOfQueue());
    }


    @Test
    public void testThatTwoElementsAreInTheQueue_theFirstElementIsReturned(){

        EneQueue queue = new EneQueue();

        queue.Enqueue("Revival");
        queue.Enqueue("Lord");

        assertEquals("Revival", queue.elementInaQueue());
    }

    @Test
    public void testThatAnElementIsInTheQueue_theElementIsPeekedInto_theSizeOfTheElementIsOne(){
        EneQueue queue = new EneQueue();

        queue.Enqueue("Broke");
        queue.peekIntoQueue();

        assertEquals(1, queue.getSizeOfQueue());
    }

    @Test
    public void testThatElementsInQueue_areRemovedInFIFO_order(){

        EneQueue queue = new EneQueue();

        queue.Enqueue("Broke");
        queue.Enqueue("Rich");
        queue.Enqueue("Girl");

        assertEquals("Broke", queue.Dequeue());
        assertEquals("Rich", queue.Dequeue());
        assertEquals("Girl", queue.Dequeue());
    }


    @Test
    public void testThatQueueHasAElements_firstElementIsRemoved_firstElementIsReturned(){

        EneQueue queue = new EneQueue();
        queue.Enqueue("Skills");
        queue.Enqueue("Professionals");

        assertEquals("Skills", queue.Dequeue());
    }

    @Test
    public void testThatQueueHasAElements_firstElementIsRemoved_firstElementIsReturned_sizeIsDecreased(){

        EneQueue queue = new EneQueue();
        queue.Enqueue("Skills");
        queue.Enqueue("Professionals");

        assertEquals("Skills", queue.Dequeue());
        assertEquals(1, queue.getSizeOfQueue());
    }

//    @Test
//    public void testThatElementInTheQueueIsEmpty(){
//
//            EneQueue queue = new EneQueue();
//            queue.isEmpty();
//            queue.Dequeue();
//
//            assertThrows(IllegalStateException.class, ()->{
//                queue.Dequeue();
//            });
//    }


    @Test
    public void testThatPollReturnsNull_whenQueueIsEmpty() {

        EneQueue queue = new EneQueue();
        assertNull(queue.poll());
    }


    @Test
    public void testThatPollRemoves_andReturnsFrontElement() {

        EneQueue queue = new EneQueue();

        queue.Enqueue("Amapiono");
        queue.Enqueue("String");

        assertEquals("Amapiono", queue.poll());
        assertEquals(1, queue.getSizeOfQueue());
    }
}