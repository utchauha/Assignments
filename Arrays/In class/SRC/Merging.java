import java.util.Scanner;
class Merging
{
	public static void main(String args[])
	{
		int a, b, c, d, e, f;

		Scanner x = new Scanner(System.in); 

		int array1[] = new int [25];
		int array2[] = new int [25];

		System.out.println("Enter the number of rows til 25 for the 1 and 2 array ");

		a = x.nextInt();
		b = x.nextInt();

		System.out.println("Enter the elements of the 1 array");

		for (c = 0; c < a; c++)
		{
			array1[c] = x.nextInt();
		}

		System.out.println("Enter the elements of the 2 array");

		for (d = 0; d < a; d++)
		{
			array2[d] = x.nextInt();
		}	
		
		for (e = 0; e < 5; e++)
		{
			for (f = 0; f < e; )
			{
			if (array1[f] == array1[e])
				{
					f++;
				}
			else 
			    {
				System.out.println(array1[f]);
				f++;
			    }	
			}
		}

	}
}