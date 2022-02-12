package school.lesson4;

public class Dog extends Animals
{
	private String name;
	private int runLimit = 500;
	private int swimLimit = 10;

	Dog sobaka = new Dog();

	public int swim(int length){
		System.out.println(name + "is swimming at: ");
		if (length > swimLimit)
			return swimLimit;
		else if(length < swimLimit && length < 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}
	public int run(int length){
		System.out.println(name + "is running at: ");
		if (length > runLimit)
			return runLimit;
		else if(length < runLimit && length < 0)
			return length;
		else
			throw new IllegalStateException("Error: Integers can't have negative value");
	}

//	private class Plate
//	{
//		private int food;
//
//		public Plate(int food)
//		{
//			this.food = food;
//		}
//
//		public void decreaseFood(int n)
//		{
//			System.out.println();
//		}
//
//		public void info()
//		{
//			System.out.println("plate:" + food);
//		}
		public void eat(){
			System.out.println("Dog is eating");
		}
		public int run(int limit){
			System.out.println("Dog is running");
		}

	}
}
