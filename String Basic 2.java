public class Main
{
	public static void main(String[] args) {
		
		// Creating two string literals
        String s1 = "geeksforgeeks";
        String s2 = "geeksforgeeks";
        
        // Whether s2 equal to s1
        System.out.println(s1.equals(s2));
        
        // Whether s2 is present in s1 or not
        // true
        System.out.println(s1.contains(s2));
        
        // Returns the first occurrence of
        // s2 in s1 after index 1
        System.out.println(s1.indexOf(s2));
	}
}