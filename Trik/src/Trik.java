import java.util.Scanner;
public class Trik 
{
	public static void main(String[] args) 
	{
		int glassLeft = 1 , glassCenter = 0 , glassRight = 0 , temp , i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for (i = 0 ; i < swap.length() ; i++)
		{
			if (swap.charAt(i) == 'A' || swap.charAt(i) == 'a')
			{
				temp = glassLeft;
				glassLeft = glassCenter;
				glassCenter = temp;
			}
			else if (swap.charAt(i) == 'B' || swap.charAt(i) == 'b')
			{
				temp = glassCenter;
				glassCenter = glassRight;
				glassRight = temp;
			}
			else
			{
				temp = glassLeft;
				glassLeft = glassRight;
				glassRight = temp;
			}
		}
		if (glassLeft == 1) 
		{
			System.out.println("Coin is in Left glass");
		}
		else if (glassCenter == 1) 
		{
			System.out.println("Coin is in Center glass");
		}
		else 
		{
			System.out.println("Coin is in Right glass");
		}
		scan.close();
	}
}