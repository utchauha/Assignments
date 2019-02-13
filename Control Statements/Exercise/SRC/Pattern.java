import java.util.Scanner;
class Pattern
{   public static void main(String args[])
    {   int N, freq, freq2, i, j,  space;
        char c;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the no of Rows");
         N = x.nextInt();
         freq = 1;
         freq2 = 1;
         c = 'A';

        for ( i = 1; i < (N * 2); i++) 
        {
            for ( space = N-freq2; space > 0; space--) 
            {
                System.out.println(" ");
            }
            if (i < N) 
            {
                freq2++;
            } 
            else 
            {
                freq2--;
            }
            for ( j = 0; j < freq; j++) 
            {
                System.out.print(c);
                if (j < freq / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < N )
            {
                freq = freq + 2;
            } 
            else
            {
                freq = freq - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}