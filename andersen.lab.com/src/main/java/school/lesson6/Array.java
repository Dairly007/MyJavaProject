package school.lesson6;

public class Array
{

	public static int arrException(String[][] arr) throws MyArraySizeException, MyArrayDataException
	{
		int res = 0;
		if (arr.length != 4)
			throw new MyArraySizeException("Invalid amount of strings");
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].length != 4)
				throw new MyArraySizeException("Invalid amount of columns");
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
				try
				{
					res += Integer.parseInt(arr[i][j]);
				} catch (NumberFormatException e)
				{
					throw new MyArrayDataException(e.getMessage(), i, j);
				}
			}
		}
		return res;
	}
}

