import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) 
	{
		int square1 , square2 , square3 , square4 , temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value_1 : ");
		square1 = scan.nextInt(); 
		System.out.print("Input Value_2 : ");
		square2 = scan.nextInt();
		System.out.print("Input Value_3 : ");
		square3 = scan.nextInt();
		System.out.print("Input Value_4 : ");
		square4 = scan.nextInt();
		if (square1 > square2)
		{
			temp = square1;
			square1 = square2;
			square2 = temp;
		}
		if (square1 > square3)
		{
			temp = square1;
			square1 = square3;
			square3 = temp;
		}
		if (square1 > square4)
		{
			temp = square1;
			square1 = square4;
			square4 = temp;
		}
		if (square2 > square3)
		{
			temp = square2;
			square2 = square3;
			square3 = temp;
		}
		if (square2 > square4)
		{
			temp = square2;
			square2 = square4;
			square4 = temp;
		}
		if (square3 > square4)
		{
			temp = square3;
			square3 = square4;
			square4 = temp;
		}
		System.out.print("\nRectangle Area = : " + " " + square3 + " " + " * " + square1 + " = " + square3 * square1);
		scan.close();
	}
}
