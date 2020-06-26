package epam.task;
import java.util.*;
import java.util.stream.*;
interface FunctionalInterface
{
	boolean isPal(String input);
}
public class Palindrome {
	static boolean isPalindrome(String input)
	{
		StringBuilder reverse = new StringBuilder(input).reverse();
	    return (reverse.toString()).equals(input);
	}
	List<String> returnPal(List<String> str)
	{
		FunctionalInterface fi=Palindrome::isPalindrome;
		return 
		str.stream().filter((s)->fi.isPal(s)).collect(Collectors.toList());
	}
}
