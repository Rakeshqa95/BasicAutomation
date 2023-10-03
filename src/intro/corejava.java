package intro;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int myNum = 7;
		String Website = "This is MSD Charity";
		char letter = 'r';
		double dec = 5.99;
	   boolean mycard = true;
	  
	   
	   System.out.println(myNum+ "this is number");
	   System.out.println(Website);
	   System.out.println(letter);
	   System.out.println(dec);
	   System.out.println(mycard);
	    
	   int[] arr = new int[5];
	   arr[0]=1;
	   arr[1]=2;
	   arr[2]=3;
	   arr[3]=4;
	   arr[4]=5;
	   
	   int[] arr2 = {1,2,3,4,5};
	   
	   System.out.println(arr2[2]);  
	 
	   //for loop arr.length -- 5 
	   
	   for(int i = 0; i< arr.length; i++)
	   {
		   System.out.println(arr[i]);
		   
	   }
	   
	   String[] name = {"MSD","Mahi","Captain Cool"};
	   
	   for(int i = 0; i<name.length; i++ )
	   {
		 System.out.println(name[i]);  
	    }
	 
	   for (String s: name)
	   {
		   System.out.println(s); 
	   }
	}
}
	

	   
		   
	   
	 
	
	   


