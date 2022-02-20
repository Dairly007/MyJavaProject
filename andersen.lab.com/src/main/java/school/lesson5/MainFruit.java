package school.lesson5;

public class MainFruit
{
	public class Main
	{
		public static void main(String[] args)
		{
			Apple apple1 = new Apple();
			Apple apple2 = new Apple();
			Orange orange1 = new Orange();
			Orange orange2 = new Orange();
			Orange orange3 = new Orange();
			Box<Apple> box1 = new Box<>(apple1, apple2);
			Box<Orange> box2 = new Box<>(orange1, orange2);
			Box<Orange> box3 = new Box<>(orange1,orange2);

			System.out.println(box3.compare(box2));
			System.out.println(box1.fruits);
			box2.transfer(box3);
		}
	}
}
