import java.util.Arrays;

public class Sorter {
	
	public static void main(String [] ar)
	{
		prettyPrint( new int[]{ 1,-1, 1 }, 0);		 // -1 1 1
	}
	
	/** * Given a number finds two numbers from an array so that the sum is equal to that number k. 
	 *  * @param numbers 
	 *  * @param k 
	 *  */ 
	
	public static void printPairsUsingTwoPointers(int[] numbers, int k)
	{ 
		if(numbers.length < 2){ 
			return; 
		} 
		
		Arrays.sort(numbers); 
		int left = 0; 
		int right = numbers.length -1; 
		
		while(left < right)
		{ 
			int sum = numbers[left] + numbers[right]; 
			
			if(sum == k)
			{ 
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]); 
				left = left + 1; 
				right = right -1; 
			}
			else if(sum < k)
			{ 
				left = left + 1; 
			}
			else if (sum > k) 
			{ 
				right = right -1; 
			} 
		} 
	} 
	
	/**
	 * Utility method to print two elements in an array that sum to k. 
	 */ 
	public static void prettyPrint(int[] random, int k)
	{ 
		System.out.println("input int array : " + Arrays.toString(random)); 
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + k); 
		printPairsUsingTwoPointers(random, k); 
	}	
	

	/**
	 *  find second smallest element from the array
	 */
	public void findSecondSmallest()
	{
		int[] elements = {-5, -4, 0, 2, 10, 3, -3};
	    int smallest = Integer.MAX_VALUE;
	    int secondSmallest = Integer.MAX_VALUE;
	    for (int i = 0; i < elements.length; i++) {
	    if (elements[i] < smallest) {
	            secondSmallest = smallest;
	            smallest = elements[i];
	        } else if (elements[i] < secondSmallest) {
	            secondSmallest = elements[i];
	        }

	    }
	    
	    System.out.println(secondSmallest);
	}
	
}
