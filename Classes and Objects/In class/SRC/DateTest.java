class Date
{
	int month;
	int day;
	int year;
	Date()
	{
		month=1;
		day=1;
		year=2000;
	}
	Date(int month, int day, int year)
	{
		this .month=month;
		this .day=day;
		this .year=year;
	}
	void display()
	{
		System.out.print ("Date is" +month);
		System.out.print("/");
		System.out.print(+day);
		System.out.print("/");
		System.out.print(+year);

	}
}
	class DateTest
	{	public static void main(String args[])
		{
		Date d= new Date(5, 13, 2018);
		d.display();
		}	


	}

