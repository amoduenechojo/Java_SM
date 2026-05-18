//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MySetTest {
//
//
//    @Test
//    public void testThatMySetExists(){
//
//        MySet sets = new MySet();
//
//        assertNotNull(sets);
//
//    }
//
//
//    @Test
//    public void testThatMySetIsEmpty(){
//
//        MySet sets = new MySet();
//
//        assertTrue(sets.isEmpty());
//        assertEquals(0, sets.getSizeOfSet());
//    }
//
//
//    @Test
//    public void testThatThereIsAEmptySet_setIsAdded_setIsOne(){
//        MySet sets = new MySet();
//        sets.isEmpty();
//
//        sets.addSet("Regret");
//
//        assertEquals(1, sets.getSizeOfSet());
//    }
//
//
//    @Test
//    public void testThatThereIsAnEmptySet_setIsAdded_emptySetIsFalse(){
//        MySet sets = new MySet();
//        sets.isEmpty();
//
//        sets.addSet("progress");
//
//        assertFalse(sets.isEmpty());
//    }
//
//
//
//    @Test
//    public void testThatICanAddInMySet() {
//
//        MySet sets = new MySet();
//        sets.addSet("Enechojo");
//
//        assertEquals(1, sets.getSizeOfSet());
//    }
//
//    @Test
//    public void testThatSetIsAdded_anotherSetIsAdded_sizeOfSetIsTwo(){
//            MySet sets = new MySet();
//
//            sets.addSet("Nnayi Python");
//            sets.addSet("Eze JavaScript");
//
//            assertEquals(2, sets.getSizeOfSet());
//    }
//
//    @Test
//    public void testThatDuplicateSetCannot_beAddedTwice_sizeOfSetRemainsOne(){
//        MySet sets = new MySet();
//
//        sets.addSet("JBL");
//        sets.addSet("JBL");
//
//        assertEquals(1, sets.getSizeOfSet());
//    }
//
//    @Test
//    public void testThatASetContainsEmptyString_emptyStringIsAdded_sizeDoesNotIncrease(){
//        MySet sets = new MySet();
//
//        sets.addSet("");
//
//        assertEquals(0, sets.getSizeOfSet());
//    }
//
//    @Test
//    public void testThatASetIsAdded_setContainsAddedSet(){
//        MySet sets = new MySet();
//
//        sets.addSet("JBL");
//
//        assertTrue(sets.containsSet("JBL"));
//    }
//
//    @Test
//    public void testThatContainsReturnsFalse_whenElementIsNotInSet(){
//        MySet sets = new MySet();
//
//        sets.addSet("Nnayi Python");
//
//        assertFalse(sets.containsSet("Eze JavaScript"));
//
//    }
//
//    @Test
//    public void testThatExistingElementsCanBeRemoved_returnsTrue_andDecreasesInSize() {
//        MySet sets = new MySet();
//
//        sets.addSet("Nnayi Python");
//        sets.removeSet("Nnayi Python");
//
//        assertTrue(sets.removeSet("Nnayi Python"));
//        assertEquals(0, sets.getSizeOfSet());
//    }
//
//
//    @Test
//    public void testThatNonExistingElementsCannotBeRemoved_returnsFalse_andSizeIsUnchanged() {
//        MySet sets = new MySet();
//
//        sets.addSet("Nnayi Python");
//        sets.removeSet("Scrunchies");
//
//        assertTrue(sets.removeSet("Scrunchies"));
//        assertEquals(0, sets.getSizeOfSet());
//    }
//
//    @Test
//    public void testThaSetIsAdded_setIsCleared_sizeIsZero_setIsEmpty(){
//        MySet sets = new MySet();
//
//        sets.containsSet("Watermelon");
//
//        sets.clearSet();
//        assertEquals(0, sets.getSizeOfSet());
//
//    }
//
//    @Test
//    public void testThatAddsAllSet_AddsMultipleElement_sizeOfSetIncreases(){
//        MySet sets = new MySet();
//
//        sets.addsAllSet("JBL", "Sony");
//        assertEquals(sets.addsAllSet("JBL", "Sony"));
//
//    }
//
//    @Test
//    public void testThatContainsAllReturnsTrue_whenAllElementsExist(){
//        MySet sets = new MySet();
//
//        sets.addSet("JBL");
//        sets.addSet("Sony");
//
//        assertTrue(sets.containsAllSet("JBL", "Sony"));
//
//    }
//
//
//    @Test
//    public void testThatContainsAllReturnsFalse_whenAnlElementDoesNotExist(){
//        MySet sets = new MySet();
//
//        sets.addSet("JBL");
//
//        assertFalse(sets.containsAllSet("JBL", "Fareed"));
//
//    }
//}