class CheckArgumentException extends Exception
{
	CheckArgumentException()
	{
		super();
	}
}	
	class Command
	{
		public static void main(String args[])
		{	int i;
			int a[] = new int[5];
			try
			{
				int count=0;
				for(i=0;i<a.length;i++)
				{
					a[i]=Integer.parseInt(args[i]);
					count++;
				}
				if(count!=5)
				throw new CheckArgumentException();
				
			}
			catch(Exception e)
			{
				System.out.println("Exception" +e);
			}
		}
	}
