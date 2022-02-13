package school.lesson4;

public class Cat extends Animals
{
	private String name;
	private int runLimit = 200;
	private int swimLimit = 0;
	private int appetite;

	public Cat(String name, int appetite)
	{
		this.name = name;
		this.appetite = appetite;
	}

	public int swim(int length)
	{
		System.out.println(name + "is swimming at: ");
		if (length > swimLimit)
			return swimLimit;
		else if (length < swimLimit && length >= 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}

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
//	public void swim(int length){
//		System.out.println(name + "can`t swim ");
//	}
//	public class Plate{
//		private int food;
//	}
//	public int run(int length){
//
//		System.out.println(name + "is swimming at: ");
//		if (length > runLimit)
//			return runLimit;
//		else if(length < runLimit && length >= 0)
//			return length;
//		else
//			throw new IllegalStateException("Integers can't have negative value");
//	}
}
