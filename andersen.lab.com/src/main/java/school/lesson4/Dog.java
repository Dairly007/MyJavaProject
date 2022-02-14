package school.lesson4;

class Dog extends Animals
{
	private String name;
	private int runLimit;
	private int swimLimit;
	private int appetite;
	private int length = 15;

//	public Dog(String name, int appetite, int length)
//	{
//		this.name = name;
//		this.appetite = appetite;
//		this.length=length;
//	}
	@Override
	public int swim(int length)
	{
		System.out.println(name + "is swimming at: ");
		if (length > swimLimit)
			return swimLimit;
		else if (length < swimLimit && length >= 0)
		{
			return length;
		} else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}

	@Override
	public int run(int length)
	{
		System.out.println(name + "is running at: ");
		if (length > runLimit)
			return runLimit;
		else if (length < runLimit && length < 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}
}
