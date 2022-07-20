/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//define String
		String s="DataStructures";
		
		//print String
		System.out.println("String is "+ s);
		
         // Returns the number of characters in the String
		System.out.println("String is "+ s.length());
		
        // Returns the character at ith index.
		System.out.println("String is "+ s.charAt(4));
		
		// Return the substring from the ith index character
        // to end of string
		System.out.println("String is "+ s.substring(3));
		
		// Returns the substring from i to j-1 index.
		System.out.println("String is "+ s.substring(3,6));
	}
}
