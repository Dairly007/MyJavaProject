package school.lesson4;

public abstract class Animals{
	public int length;
	public String name;
	public int runLimit;
	public int swimLimit;
	public int appetite;

	abstract int swim();
	abstract int run();
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
//		public void eat(){
//			System.out.println("Dog is eating");
//		}
//		public int run(int limit){
//			System.out.println("Dog is running");
//		}
//}
