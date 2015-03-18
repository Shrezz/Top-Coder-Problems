package ArraysandString;

public class longestPalindrome {
	public static int longestPal(String str){
		int low;
		int high;
		int start=0;
		int len = str.length();
		int maxLength =1;
		for (int i = 1; i < len; ++i)
	    {
	        // Find the longest even length palindrome with center points
	        // as i-1 and i.  
	        low = i - 1;
	        high = i;
	        while (low >= 0 && high < len && str.charAt(low) == str.charAt(high))
	        {
	            if (high - low + 1 > maxLength)
	            {
	                start = low;
	                maxLength = high - low + 1;
	            }
	            --low;
	            ++high;
	        }
	 
	        // Find the longest odd length palindrome with center 
	        // point as i
	        low = i - 1;
	        high = i + 1;
	        while (low >= 0 && high < len && str.charAt(low) == str.charAt(high))
	        {
	            if (high - low + 1 > maxLength)
	            {
	                start = low;
	                maxLength = high - low + 1;
	            }
	            --low;
	            ++high;
	        }
	    }
		
		System.out.println("Longest palindrome substring is:"+str.substring(start, start+maxLength)); 
		return maxLength;
		}
	
	public static void main(String args[]){
		System.out.println(longestPal("HYTBCABADEFGHABCDEDCBAGHTFYW1234567887654321ZWETYGDE"));
	}
}
