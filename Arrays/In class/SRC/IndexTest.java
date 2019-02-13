import java.util.Scanner;
class Index
{
		int a, b, i;
		int array[]= new int[10];
		void entering()
		{
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the no of elements that you want to enter in your array");
		a= x.nextInt();
		System.out.println("Enter the elements of array");
		for(i=0;i<a;i++)
		{
			array[i]=x.nextInt();
		}
	} 
		void index()
		{ Scanner x= new Scanner(System.in);
		System.out.println("Enter the element whose index you want");
		b= x.nextInt();
		for(i=0;i<a;i++)
		{	if(array[i]==b)
		{
				System.out.println("index is" +i);
		}
		
		}
	}

	}
class IndexTest
{
	public static void main(String args[])
	{
		Index I1= new Index();
		I1.entering();
		I1.index();		
	}
}