package school.lesson4;

import java.util.Random;

public abstract class Animals implements
{
	private String name;
	private int runLimit;
	private int swimLimit;
	int length;
	public void info(){
		System.out.println("name: "+ name);
	}

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
