import java.util.Scanner;
class Character
{
	public static void main(String args[])
	{
		char ch;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the character");
		ch= x.next().charAt(0);
		if((ch =='a')|| (ch =='e')|| (ch =='i')|| (ch =='o')|| (ch =='u')|| (ch =='A')|| (ch =='E')|| (ch =='I')|| (ch =='O')|| (ch =='U'))		
		{
			System.out.println("The character is a vowel");
		}
		else
			if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
		{
			System.out.println("The character is a consonant");
		}
		
		

	}


}