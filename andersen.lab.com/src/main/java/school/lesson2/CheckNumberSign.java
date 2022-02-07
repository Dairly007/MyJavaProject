package school.lesson2;

import java.util.Scanner;


public class CheckNumberSign
{

	public static boolean checkNumberSign(int a)
	{
		System.out.println("Number is: " + a + "\n");
		if (a >= 0)
		{
			System.out.println("True: Number is positive");
			return true;
		} else
		{
			System.out.println("False: Number is negative");
			return false;
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any one integer: ");
		int firstNumber = scan.nextInt();
		scan.close();
		checkNumberSign(firstNumber);
	}
}
