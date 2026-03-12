public class TapSwap{

	public int getLength(int[] numbers){
		return numbers.length;
	}

	public boolean isEven(int[] numbers){
	
		return numbers.length % 2 == 0;
	}

	public int[] swapArrayOf(int [] numbers){
		
		int lengthOfArray = 0;		

		if (isEven(numbers)) lengthOfArray = getLength(numbers);
		else lengthOfArray = getLength(numbers) - 1;

		for(int index = 0; index < lengthOfArray; index += 2) {
			int temp = numbers[index];
			numbers[index] = numbers[index + 1];
			numbers[index + 1] = temp;
		}

			return numbers;
		
	}



}