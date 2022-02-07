package school.lesson2;

public class ArrReverse
{
	public static void arrReverse(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int c = 0;
			c = c + arr[i];
			if (c == 0)
			{
				System.out.print(1 + " ");
			} else if (c == 1)
				System.out.print(0 + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
		{
			int rand = (int) (Math.random() * 3 - 1);
			arr[i] = rand;
			System.out.print(rand + " ");
		}
		System.out.println("\n" + "Reversing..............");
		arrReverse(arr);
	}
}