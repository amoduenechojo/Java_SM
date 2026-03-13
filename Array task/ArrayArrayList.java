public class ArrayArrayList{

	public static void main (String [] args){

		int [] array = {7, 2, 1, 6, 3, 9, 5}; //second format

	//Reversing by creating another array
		for (int value : numberReversal(array)){
			System.out.print(value + " ");
		}
		System.out.println();	
	//Reversing without creating another array	

		for (int value : numberReversalWithoutNewArray(array)){
			System.out.print(value + " ");
		}
		System.out.println();
	//Sorting of array (descending)	

		for (int value : descendingNumberSorting(array)){
			System.out.print(value + " ");
		}
		System.out.println();

	//Sorting of array (ascending)	

		for (int value : ascendingNumberSorting(array)){
			System.out.print(value + " ");
		}
		System.out.println();
	
	}

	public static int [] numberReversal(int [] scores){

		int [] reversedScores = new int [scores.length];

		for (int index = 0; index < scores.length; index++){
			reversedScores[index] = scores[scores.length - 1 - index];
		}

		return reversedScores;
	}

	public static int [] numberReversalWithoutNewArray(int [] scores){

		for (int index = 0; index < (scores.length/2); index++){
			int value = scores[index];
			scores[index] = scores[scores.length - 1 - index];
			scores[scores.length - 1 - index] = value;
		}
		return scores;
	}

	public static int [] descendingNumberSorting(int [] scores){
		
		for (int index = 0; index < scores.length; index++){
			int largest = scores[index];

			for (int inIndex = index; inIndex < scores.length; inIndex++){
				if (scores[inIndex] > largest){
					largest = scores[inIndex];
					scores[inIndex] = scores[index];
					scores[index] = largest;
				}
			}

		}

		return scores;

	}

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