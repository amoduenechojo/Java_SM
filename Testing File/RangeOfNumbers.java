public class RangeOfNumbers{


    public static int [] fromLargestToLowest(int [] numbers){
		
		for (int index = 0; index < numbers.length; index++){
			int largestNumber = numbers[index];

			for (int count = index + 1; count < numbers.length; count++){
				if (numbers[count] > largestNumber){
					largestNumber = numbers[count];
					numbers[count] = numbers[index];
					numbers[index] = largestNumber;
				}
			}
		}

		return numbers;

	}


    public static int getSecondLargestNumber(int [] numbers){

        int largestNumber = numbers[0];
        int largestIndex = 0;
        int secondLargest = 0;
            for (int index = 1; index < numbers.length; index++) {
                if (numbers[index] > largestNumber){
                        largestNumber = numbers[index];
                        
            }      
       
               if(number[index] == largestNumber){
                    secondLargestNumber = numbers[index] + 1;
                }
         }

        return largestNumber;
    }


    public static int getSecondLowestNumber(int [] numbers){












    }






























}

