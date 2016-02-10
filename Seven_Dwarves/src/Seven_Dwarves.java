import java.util.Scanner;
public class Seven_Dwarves 
{
	public static void main(String[] args) 
	{
		int dwarf1 , dwarf2 , dwarf3 , dwarf4 , dwarf5 , dwarf6 , dwarf7 , dwarf8 , dwarf9 , sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		dwarf1 = scan.nextInt();
		System.out.print("Enter Number 2 : ");
		dwarf2 = scan.nextInt();
		System.out.print("Enter Number 3 : ");
		dwarf3 = scan.nextInt();
		System.out.print("Enter Number 4 : ");
		dwarf4 = scan.nextInt();
		System.out.print("Enter Number 5 : ");
		dwarf5 = scan.nextInt();
		System.out.print("Enter Number 6 : ");
		dwarf6 = scan.nextInt();
		System.out.print("Enter Number 7 : ");
		dwarf7 = scan.nextInt();
		System.out.print("Enter Number 8 : ");
		dwarf8 = scan.nextInt();
		System.out.print("Enter Number 9 : ");
		dwarf9 = scan.nextInt();
		sum = dwarf1 + dwarf2 + dwarf3 + dwarf4 + dwarf5 + dwarf6 + dwarf7 + dwarf8 + dwarf9;
			if (sum-(dwarf9+dwarf8) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7);
			}
			else if (sum-(dwarf9+dwarf7) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8);
			}
			else if (sum-(dwarf9+dwarf6) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8);
			}
			else if (sum-(dwarf9+dwarf5) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			}
			else if (sum-(dwarf9+dwarf4) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			}
			else if (sum-(dwarf9+dwarf3) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			}
			else if (sum-(dwarf9+dwarf2) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			}
			else if (sum-(dwarf9+dwarf1) == 100)
			{
				System.out.println(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8);
			}
			else if (sum-(dwarf8+dwarf7) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf9);
			}
			else if (sum-(dwarf8+dwarf6) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf8+dwarf5) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			}
			else if (sum-(dwarf8+dwarf4) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			}
			else if (sum-(dwarf8+dwarf3) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			}
			else if (sum-(dwarf8+dwarf2) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			}
			else if (sum-(dwarf8+dwarf1) == 100)
			{
				System.out.println(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf9);
			}
			else if (sum-(dwarf7+dwarf6) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf7+dwarf5) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf7+dwarf4) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf7+dwarf3) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf7+dwarf2) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf7+dwarf1) == 100)
			{
				System.out.println(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf6+dwarf5) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf6+dwarf4) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf6+dwarf3) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf6+dwarf2) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf6+dwarf1) == 100)
			{
				System.out.println(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf5+dwarf4) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf3+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf5+dwarf3) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf5+dwarf2) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf5+dwarf1) == 100)
			{
				System.out.println(dwarf2+"\n"+dwarf3+"\n"+dwarf4+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf4+dwarf3) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf2+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf4+dwarf2) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf4+dwarf1) == 100)
			{
				System.out.println(dwarf2+"\n"+dwarf3+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf3+dwarf2) == 100)
			{
				System.out.println(dwarf1+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf3+dwarf1) == 100)
			{
				System.out.println(dwarf2+"\n"+dwarf4+"\n"+dwarf5+"\n"+dwarf6+"\n"+dwarf7+"\n"+dwarf8+"\n"+dwarf9);
			}
			else if (sum-(dwarf2+dwarf1) == 100)
			{
				System.out.println(dwarf3 + "\n" + dwarf4 + "\n" + dwarf5 + "\n" + dwarf6 + "\n" + dwarf7 + "\n" + dwarf8 + "\n" + dwarf9);
			}
			else
			{
				System.out.println("Error");
			}
		scan.close();
		}
}