package school.lesson4;

public class Dog extends Animals
{

	@Override
	public void animal(String name, int length, int appetite)
	{
		super.name = name;
		super.length = length;
		super.appetite = appetite;
	}

	@Override
	public int swim(int length)
	{
		super.swimLimit = 10;
		System.out.println(super.name + " is swimming at: ");
		if (length > super.swimLimit)
			return super.swimLimit;
		else if (length < super.swimLimit && length >= 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}

	@Override
	public int run(int length)
	{
		super.runLimit = 500;
		System.out.println(super.name + " is running at: ");
		if (length > super.runLimit)
			return super.runLimit;
		else if (length < super.runLimit && length > 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}
}
