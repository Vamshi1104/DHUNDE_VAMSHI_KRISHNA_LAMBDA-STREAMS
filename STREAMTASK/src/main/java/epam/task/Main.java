package epam.task;

import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//Average of Integers:
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,7,8);
		Average obj1=new Average();
		System.out.println("The Average is:" + obj1.findAverage(li));
		
		/*
		Filter strings that start  with  the  letter  'a'  (lower case)
		and have  exactly  3  letters. 
		*/
		
		List<String> str=Arrays.asList("abc","bcd","abcde","acd","fgh","acdef");
		StringFilter obj2=new StringFilter();
		System.out.println("The Strings are:" + obj2.sFilter(str));
		
		//Filtering palindromic Strings
		
		List<String> str1=Arrays.asList("madam","palind","wow","wooow","total","appa");
		Palindrome obj3=new Palindrome();
		System.out.println("The Palindromes are:" + obj3.returnPal(str1));
		
	}
}
