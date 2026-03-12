import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TapSwapTest{


	@Test
	public void testThatLengthIsChecked(){ 
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		TapSwap swapper = new TapSwap();
		int expectedLength = swapper.getLength(numbers);
		int actualLength = 6;
		assertEquals(expectedLength, actualLength);
	}

	@Test
	public void testThatLengthIsEvenOrOdd(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		TapSwap swapper = new TapSwap();
		boolean isEven = swapper.isEven(numbers);
		assertTrue(isEven);
	}

	@Test
	public void testThatGivenArrayIsSwappedWithEvenLength(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		TapSwap swapper = new TapSwap();
		int [] expectedArray = swapper.swapArrayOf(numbers);
		int [] actualArray = {7, 5, 3, 6, 4, 2};
		assertArrayEquals(expectedArray, actualArray);

	}

	@Test
	public void testThatGivenArrayIsSwappedWithOddLength(){
	
		int [] numbers = {5, 7, 6, 3, 2};
		TapSwap swapper = new TapSwap();
		int [] expectedArray = swapper.swapArrayOf(numbers);
		int [] actualArray = {7, 5, 3, 6, 2};
		assertArrayEquals(expectedArray, actualArray);

	}

}
