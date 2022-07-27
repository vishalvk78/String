public class Main
{
	public static void main(String[] args) {
		String name="abcba";
		int n=name.length();
		//Stores the reverse of given string    
		String reversedStr="";
	     //Iterate through the string from last and add each character to variable reversedStr   
		for(int i=n-1;i>=0;i--){
		    reversedStr=reversedStr + name.charAt(i);
		}
		
		if(name.contains(reversedStr)==true)
		{
		    System.out.println("String is palindrome");
		}
		else 
		System.out.println("String is not palindrome");
	
	}
}