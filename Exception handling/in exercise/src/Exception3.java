public class Exception3
{
	private static Integer i = null;	
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(i.toString());
		}
		catch(NullPointerException e) 
		 {
		 	System.out.println("Caught NullPointerException");
		 }		
		try 
		{
			i = 10;
			System.out.println(i.toString());
		}
		 catch(NullPointerException e) 
		 {
		 	System.out.println("Caught NullPointerException");
		 }
		 finally
		 {
		 	System.out.println("Got through it");
		 }
	}	
}