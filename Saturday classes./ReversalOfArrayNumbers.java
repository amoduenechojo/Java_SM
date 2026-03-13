public class ReversalOfArrayNumbers{

	public static void main (String [] args){

		int [] array = {8, 4, 3,7};

    for (int value : numberReversal(array)){
			System.out.print(value + " ");
		}
		System.out.println();	
	
		for (int value : numberReversalWithoutNewArray(array)){
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
 }
//}
