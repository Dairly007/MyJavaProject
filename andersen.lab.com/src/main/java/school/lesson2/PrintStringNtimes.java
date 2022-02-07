package school.lesson2;

import java.util.Scanner;

public class PrintStringNtimes
{

	public static void printStringNtimes(String firstString, int firstInt)
	{
		for (int i = 0; i < firstInt; i++)
			System.out.println(firstString);
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any one integer and any one string: ");
		String firstString = scan.next();
		int firstInt = scan.nextInt();
		System.out.println("You entered text: "+ firstString+"\n and how many " +
				"times text is repeating: "+firstInt);
		scan.close();
		printStringNtimes(firstString, firstInt);
	}
}
