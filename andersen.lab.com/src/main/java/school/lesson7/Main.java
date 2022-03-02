package school.lesson7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter csvWriter = new FileWriter("new.csv");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		String header = null;
		int[][] data;
		int i = 0;
		int j = 0;
		try
		{
			System.out.println("Enter name of headers an spaces");
			header = sc.nextLine();
			int tmp = sc.nextInt();
			for ()

		} catch (Exception e)
		{
			System.out.println("It's not string");
			e.printStackTrace();
		}
		System.out.println(header);
	}
}
	/*");
csvWriter.append("Name");
		csvWriter.append(",");
		csvWriter.append("Role");
		csvWriter.append(",");
		csvWriter.append("Topic");
		csvWriter.append("\n");*/