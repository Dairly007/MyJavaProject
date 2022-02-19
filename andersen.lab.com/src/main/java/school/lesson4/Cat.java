package school.lesson4;

public class Cat extends Animals

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
		super.swimLimit = 0;
		System.out.println(super.name + "can't swimming");
		return super.swimLimit;
	}

	@Override
	public int run(int length)
	{
		super.runLimit = 200;
		System.out.println(super.name + "is running at: ");
		if (length > super.runLimit)
			return super.runLimit;
		else if (length < super.runLimit && length < 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}
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

