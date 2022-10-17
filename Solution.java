import java.util.Scanner;

public class Solution {

	public static void wordreverse(char str[],
	                    int startpoint,
	                    int endpoint)
	{
	  char temp;
	   
	  while (startpoint <= endpoint)
	  {
	    // Swapping the value

	    temp = str[startpoint];
	    str[startpoint] = str[endpoint];
	    str[endpoint] = temp;
	    startpoint++;
	    endpoint--;
	  }
	}
	// Function for reverse the word
	static char[] reverseWords(char []s)
	{
	 
	  int start = 0;
	  for (int end = 0; end < s.length; end++)
	  {
 
	    if (s[end] == ' ')
	    {
	    	wordreverse(s, start, end);
	      start = end + 1;
	    }
	  }
	 
	  // Reverse the last word
	  wordreverse(s, start, s.length - 1);
	 
	  // Reverse the entire String
	  wordreverse(s, 0, s.length - 1);
	  return s;
	}
	 
	// Main method 
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
	  String str = s.nextLine();
	  
	  char []p = reverseWords(str.toCharArray());
	  System.out.print(p);
	}
	}

