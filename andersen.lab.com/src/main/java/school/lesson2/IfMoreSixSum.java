package school.lesson2;

public class IfMoreSixSum
{
	public static void IfMoreSixSum(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int mem = 0;
			mem = mem + arr[i];
			if (mem < 6)
				System.out.print(mem * 2 + ", ");
			else
				System.out.print(mem + ", ");
		}
	}

	public static void main(String[] args)
	{
		int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		IfMoreSixSum(array);
		System.out.println("\n" + "FINISH");
	}
}
