class TestProcessorCSV
{
	public static void main(String args[])
	{
		CSVProcessor cv=new CSVProcessor();
		try
		{
			System.out.println(cv.processCSV("example.csv","jasonfile.json"));
		}
		catch(Exception e){}
	}
}