package school.lesson6;

public class MyArrayDataException extends Throwable
{

	public MyArrayDataException(String message, int i, int j)
	{

		super(String.format("Invalid data in element [%d,%d]\n",i, j));

	}

}
