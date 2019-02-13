import java.io.*;
class CSVProcessor
{
	public boolean processCSV(String csvFileName,String jsonFileName)
	throws Exception

	{
		FileHeader fr=new FileReader(csvFileName);
		BufferedReader br=new BufferedReader(fr);
		String headerline=br.readline();
		String() KeyNames= headerline.split(",");
		int i=0;
		while(i<KeyNames.length)
		{
			System.out.println(KeyNames[i]);
			i++;
		}
		return (true);
	}
	
}