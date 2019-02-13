import java.util.Scanner;
class Value
{
	void Valuetest()
	{
		int a, b, c, d;

		Scanner x = new Scanner(System.in); 
		int array[] = new int [5];

		System.out.println("Enter five numbers between 10 and 100, both inclusive");
		
		for ( a = 0; a < 5;)
		{
			b = x.nextInt();
			if (b < 10 || b > 100)
				{
					System.out.println("The entered number is wrong");
			        
			    }    
			else
			    {
				    array[a] = b;
			     	a++;
			    } 
			
		}	
		for (c = 0; c < 5; c++)
		{
			for (d = 0; d < c; )
			if (array[d] == array[c])
				{
					d++;
				}
			else 
			    {
				System.out.println(array[d]);
				d++;
			    }	
 
		}

	}
}

class ValueTest
{
	public static void main(String args[])
	{
		Value V1= new Value;
		V1.Valuetest();
	}
}