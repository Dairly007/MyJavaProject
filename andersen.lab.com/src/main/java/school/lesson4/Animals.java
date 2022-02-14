package school.lesson4;

public abstract class Animals implements AnimalAction{
	protected int length;
	protected String name;
	public int runLimit;
	public int swimLimit;
	protected int appetite;


	//	public Dog(String name, int appetite, int length)
//		{
//			this.name = name;
//			this.appetite = appetite;
//			this.length=length;
//		}
	public abstract int swim(int length);

	public abstract int run(int length);
}
/*
	private class Plate
	{
		private int food;

		public Plate(int food)
		{
			this.food = food;
		}

		public void decreaseFood(int n)
		{
			System.out.println();
		}

		public void info()
		{
			System.out.println("plate:" + food);
		}
		public void eat(){
			System.out.println("Dog is eating");
		}
		public int run(int limit){
			System.out.println("Dog is running");
		}
}
*/
