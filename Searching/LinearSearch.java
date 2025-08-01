package searching.com;

// Linear Search is a Searching Algorithm 
// It requires More Time Complexity O(n)
public class LineraSearch {

	public static void main(String[] args) {
		int nums [] = {5,7,9,11,13};
		int target = 11;
		// Calling static method and store in the result
		int result = LinearSearch(nums,target);
		if(result != -1)
			System.out.println("Element Found at : " + result);
		else
			System.out.println("Element not Found");

	}
	static int LinearSearch(int nums [], int target)
	{
		for(int i=0;i<nums.length;i++)
		{
			// Condition become true
			if(nums[i]==target)
			{
				return i;
			}
		}
		return -1;
	}

}
