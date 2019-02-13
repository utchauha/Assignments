import java.util.Scanner;
class Compare
{
	public static void main(String args[])

	{
		float a;
		float b;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the two Floating values");
		a=x.nextFloat();
		b=x.nextFloat();
		a=a*1000;
		b=b*1000;
		if(a==b)
		{
			System.out.println("The two numbers are same upto three decimal places");

		}
		else
		{
			System.out.println("The two numbers are not same upto three decimal places");
		}
	}
}