public class ArraySorting{

    public static int [] ascendingNumberSorting(int [] scores){
		
		for (int index = 0; index < scores.length; index++){
			int smallest = scores[index];

			for (int inIndex = index; inIndex < scores.length; inIndex++){
				if (scores[inIndex] < smallest){
					smallest = scores[inIndex];
					scores[inIndex] = scores[index];
					scores[index] = smallest;
				}
			}

		}

		return scores;

	}
}
