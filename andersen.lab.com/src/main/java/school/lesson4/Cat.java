package school.lesson4;

public class Cat extends Animals {
	private String name;
	private int runLimit = 200;
	private int swimLimit = 0;
	private int appetite;
	private int length;

	public Cat(String name, int appetite)
	{
		this.name = name;
		this.appetite = appetite;
	}

	@Override
	public int swim(int length)
	{
		System.out.println(name + "can't swimming");
		return swimLimit;
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

//	public class Main
//	{
//		public static void main(String[] args)
//		{
//			Animals a = new Cat("barsa", 95);
//			a.swim();
//
//		}
//	}
}
