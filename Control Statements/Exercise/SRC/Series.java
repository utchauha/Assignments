import java.util.*;
class Series
{
	public static void main(String args[])
	{
		int a, b, c;
		int d=1;
		int e=1;
		Scanner frequency = new Scanner(System.in);
		System.out.println("Enter the base part");
		c= frequency.nextInt();
		System.out.println("Enter the value of N");
		b=frequency.nextInt();

		for(a=1; a<=b; a++)
		{
			e = e +d / a;
			d = d*c; 
		}
		System.out.printf("the sum is" +e);
	}
}
