/**
 * This class provides different functions to operate on strings.
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class StringSmith {
	
	/**
	 *  reverse a string without using inbuilt functions
	 *  @param s : string to be reversed
	 */
	public static String reverse(String s)
	{
		StringBuilder new_string = new StringBuilder();
		for(int i = s.length()-1 ; i >= 0 ; --i)
			new_string.append(s.charAt(i));
		return new_string.toString();
		
	}
	
	/**
	 *  reverse a string recursively
	 *  @param s : string to be reversed
	 */
	public static String reverse_recursive(String s)
	{
		if(s.length() == 0)
			return "";
		return s.charAt(s.length()-1) + reverse_recursive(s.substring(0, s.length()-1));
	}
	
	/**
	 *  find whether a string is palindrome or not 
	 *  @param s : string to be checked 
	 */
	public static boolean isPalindrome(String s)
	{
		int len = s.length();
		for(int i = 0 ; i< (len/2);i++)
			if(s.charAt(i)!=s.charAt(len-i-1))
				return false;
		return true;
	}
	
	/**
	 * check if the string is null or empty
	 * @param s : original string
	 */
	public static String isEmptyorNull(String s)
	{
		if(s!=null && s.length()==0)
			return "Empty";
		else
			return "Null";
		
	}
	
	/**
	 *  check if all characters in string are unique
	 *  @param s : string
	 */
	public static boolean isPurelyUnique(String s)
	{
		boolean charpresent[] = new boolean[256];
		for(int i=0;i<s.length();i++)
		{
			int val = s.charAt(i);
			if(charpresent[val])
				return false;
			charpresent[val] = true;
		}
		return true;
	}
	
}
