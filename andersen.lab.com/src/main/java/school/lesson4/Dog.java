package school.lesson4;

public class Dog extends Animals
{
	public static int countDogs = 0;

	public Dog(String name, int runLimit, int swimLimit, int appetite)
	{
		super(name, runLimit, swimLimit, appetite);
		System.out.println("Current amount of the dogs is: "+(countDogs+1));
	}

	@Override
	public int swim(int length)
	{
		swimLimit = 10;
		System.out.println(name + " is swimming at: ");
		if (length > swimLimit)
			return swimLimit;
		else if (length <= swimLimit && length >= 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}
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
		swimLimit = 10;
		System.out.println(name + " is swimming at: ");
		if (length > swimLimit)
			return swimLimit;
		else if (length <= swimLimit && length >= 0)
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
		runLimit = 500;
		System.out.println(name + " is running at: ");
		if (length > runLimit)
			return runLimit;
		else if (length < runLimit && length > 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}
}
	@Override
	public int run(int length)
	{
		runLimit = 500;
		System.out.println(name + " is running at: ");
		if (length > runLimit)
			return runLimit;
		else if (length < runLimit && length > 0)
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

