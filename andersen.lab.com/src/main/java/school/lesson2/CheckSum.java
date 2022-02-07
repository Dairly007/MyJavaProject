package school.lesson2;

import java.util.Scanner;

public class CheckSum
{

	public static boolean checkSum(int a)
	{
		System.out.println("Summary is: " + a);


		if (a >= 10 && a <= 20)
		{
			System.out.println("TRUE: Total value in the range");
			return true;
		} else
		{
			System.out.println("FALSE: Total value isn't covering " + "the integer range from 10 to 20\n" + "TRY AGAIN! YOU DEAD!");
			return false;
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any two integers that, when summed, will have" + " a value between 10 and 20: ");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
		scan.close();
		int sum = secondNumber + firstNumber;
		checkSum(sum);

	}
}
