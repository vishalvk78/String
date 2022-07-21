public class Main
{
	public static void main(String[] args) {
		
		String name="Vishal Kadam";
		int n=name.length();
		
		//Stores the reverse of given string    
		String reversedStr="";
		
	     //Iterate through the string from last and add each character to variable reversedStr   
		for(int i=n-1;i>=0;i--){
		    reversedStr=reversedStr + name.charAt(i);
		}
		//Original String
		System.out.println("Original String is : " + name);
		
		//Reversed String
		System.out.println("Reversed String is : " + reversedStr);
	}
}
