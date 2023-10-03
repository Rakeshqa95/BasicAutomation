package intro;

public class corejava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String s = "MSD is Captain Cool";
		String s1 = "Run Machine King Kohli";
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome Team");
		
		String s = "Cricket is a emotion for Indians"; 

		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println(splittedString[3]);
		System.out.println(splittedString[4]);
		System.out.println(splittedString[5]);
		
	  for(int i = 0; i<s.length(); i++)
		{
		System.out.println(s.charAt(i));
		}
	
		//char print in Reverse order
		
		for (int i = s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
	
	}
	

}
