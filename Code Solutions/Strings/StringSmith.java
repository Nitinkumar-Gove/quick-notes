import java.util.HashMap;
import java.util.Map;

/**
 * This class provides different functions to operate on strings.
 * @author Nitinkumar Gove
 * @version 1.1
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
	
	/**
	 *  check if two strings are anagrams of each other
	 *  @param s1 : string 1 
	 *  @param s2 : string 2
	 *  @notes This can be done in linear time using constant space.
	 *  This code does not sort and hence can be done using simple loops. 
	 *  The overall runtime is O(n) and overall space is O(1) -- hence being the fastest solution. 
	 *  The number of elements you can have in the hash map is constant.
	 */
	public static boolean areAnagrams(String s1, String s2)
	{
		// return false if two strings have different lengths
		if(s1.length() != s2.length() )
			return false;
		
		Map<String, Integer> allchars = new HashMap<>();
		
		char charset[];
		
		// load all characters from string 1 into the hashmap
		charset= s1.toCharArray();
		for(char c : charset)
		{
			allchars.put(Character.toString(c), 0);
		}
		
		// load all characters from string 2 into the hashmap
		charset = s2.toCharArray();
		for(char c : charset)
		{
			allchars.put(Character.toString(c), 0);
		}
		
		// check for value for each key
		for(Map.Entry<String, Integer> m : allchars.entrySet())
		{
		      if(m.getValue() > 1 )
		    	  return false;
		}
		
		return true;
	}
	
}
