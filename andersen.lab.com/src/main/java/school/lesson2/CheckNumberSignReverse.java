package school.lesson2;

import java.util.Scanner;


public class CheckNumberSignReverse
{

	public static boolean checkNumberSignReverse(int a)
	{
		System.out.println("Number is: " + a + "\n");
		if (a >= 0)
		{
			System.out.println("False: Number is positive");
			return false;
		} else
		{
			System.out.println("True: Number is negative");
			return true;
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any one integer: ");
		int firstNumber = scan.nextInt();
		scan.close();
		checkNumberSignReverse(firstNumber);
	}
}
