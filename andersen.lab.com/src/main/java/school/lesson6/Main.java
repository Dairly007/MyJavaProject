package school.lesson6;

public class Main
{
	public static void main(String[] args) throws MyArraySizeException, MyArrayDataException
	{
		String[][] arr = new String[][]{{"1", "2", "3","4"}, {"11", "22", "33", "44"},
				{"111", "222", "333", "444"}, {"1111", "2222", "3333", "4444"}};
		try
		{
			try
			{
				Array.arrException(arr);
			} catch (MyArraySizeException e)
			{
				e.printStackTrace();
			} catch (MyArrayDataException e)
			{
				e.printStackTrace();
			}
		}finally
		{

		}
	}
}