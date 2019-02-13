import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
	public static void main(String args[])
	{
		double a, b, c, d, e, f;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the values of a, b, c");
		a=x.nextDouble();
		b=x.nextDouble();
		c=x.nextDouble();
		d=(b*b)-4*a*c;
		if(d>0)
		{
		  e=Math.sqrt((b*b)-4*a*c/(2*a));
		  f=Math.sqrt(-(b*b)-4*a*c/(2*a));
		  System.out.println("The first root is" +e);
		  System.out.println("The Second root is" +f);

		}
	    if(d<0)
		{
			System.out.println("Real roots doesnot exist");

		}

		}
	}
