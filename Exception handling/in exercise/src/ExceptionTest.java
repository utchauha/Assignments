import java.util.Scanner;
class ExceptionTest
{
	public static void main(String args[])
	{
		try
		{
			int x;
			x=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("the exception is " +e);
		}
	
		try
		{
		int a[]=new int[10];
		a[20]=50;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The exception is " +e);
		}

		try
		{
			String s="abhi";
			int y=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("The exception is " +e);
		}
		try
		{
			String s=null;
			System.out.println("The exception is " +(s.length()));
		}
		catch(NullPointerException e)
		{
			System.out.println("The Exception is " +e);
		}
		try
		{
			Scanner x=new Scanner(System.in);
			String s=new String();
			s=x.next();
			if(s.equals("null"));
				throw new IOException
		}

	}
}