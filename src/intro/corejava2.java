package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122,128,130,60};
		
		  for (int i=0; i<arr2.length; i++)
		  {
			  
			  if (arr2[i] % 9 == 0)
	
			  {
				 System.out.println(arr2[i]);      
				 break;
			  }
			  
			  else
				  
			  {				  
				  System.out.println(arr2[i] + " is not multiple by 9");     		              	  
		      }     
			}
		  
		  ArrayList <String> a = new ArrayList <String>();
		  
		  a.add("MSD");
		  a.add("Captain Cool");
		  a.add("Mahi");
		  a.add("King Kohli");
		  
		  System.out.println(a.get(3));
		
		  for (int i = 0; i<a.size(); i++)
		  {
			  System.out.println(a.get(i));
		  }
	
		  System.out.println("##############");
		  for (String  val:a)
		  {
			  System.out.println(val); 
		  }
		  
		  System.out.println("######Bolean Value######");
		  System.out.println(a.contains("King Kohli"));
		  System.out.println(a.contains("King"));
		  
		 String[] name = {"MSD","Mahi","Captain Cool"};
         List <String> nameArrayList = Arrays.asList(name);
         nameArrayList.contains("Captain Cool"); 
	}
}
 
  




