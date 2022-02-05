package school.lesson2;

import java.util.Scanner;

public class CheckSum {

	public static boolean checkSum(int a)
	{
		System.out.println("Summary is: " + a);
		// System.out.println("Error: Summary isn't covering " +
		//	"integer range from 10 to 20.\n" + "TRY AGAIN! YOU DEAD!");
		//System.out.println("Summary in range. Good work! Summary " +
		//		"value is: " + sum);
		if (a >= 10 && a <= 20)
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any two integers that, when summed, will have" +
				" a value between 10 and 20: ");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
		scan.close();
		int sum = secondNumber + firstNumber;
		checkSum(sum);
	}
}
