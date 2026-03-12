import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSumTest{

    @Test
    public void testNumberIsEqual(){
        int actual = NumberSum.sumOfNumbers(5, 7);
        int expected = 12;

        assertEquals(actual, expected);

    }

    @Test
    public void testNumberIsEven(){
        boolean actual = NumberSum.evenNumber(12);

        assertTrue(actual);

    }

    @Test
    public void testNumberIsNotEven(){
        boolean actual = NumberSum.evenNumber(13);

        assertFalse(actual);

    }

}
