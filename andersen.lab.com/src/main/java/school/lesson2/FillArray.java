package school.lesson2;

public class FillArray
{
	public static void fillArray(int[] arr)
	{
		int mem = 1;
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = mem;
			System.out.print(mem + ", ");
			mem = mem + 1;
		}
	}

	public static void main(String[] args)
	{
		int[] array = new int[100];
		fillArray(array);
		System.out.println("\n" + "FINISH");
	}
}
