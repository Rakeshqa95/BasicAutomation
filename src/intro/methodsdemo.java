package intro;

public class methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodsdemo d = new methodsdemo();
		String name = d.getData();
		System.out.println(name);
		methodsdemo2 d1 = new methodsdemo2();
		d1.getUserData();
		getData2();	
 }
 
	public String getData()
	{
		System.out.println("Hello Team");
		return ("Captain Cool"); 
	}

	
	public static String getData2()
	{
		
		System.out.println("King Kohli");
		return("RunMachine");	
	        	
	}
}
