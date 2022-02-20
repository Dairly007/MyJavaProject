package school.lesson4;

public class Cat extends Animals
{
	public static int countCats = 0;

	public Cat(String name, int runLimit, int swimLimit, int appetite)
	{
		@Override
		public void animal(String name, int length, int appetite)
		{
			super(name, runLimit, swimLimit, appetite);
			System.out.println("Current amount of cats is: " + (countCats += 1));
			super.appetite = 100;
			super.name = name;
			super.length = length;
			super.appetite = appetite;
		}

		@Override
		public int swim(int length)
		{
			swimLimit = 0;
			System.out.println(name + " can't swimming:");
			return swimLimit;
			super.swimLimit = 0;
			System.out.println(super.name + " can't swimming");
			return super.swimLimit;
		}

		@Override
		public int run(int length)
		{
			runLimit = 200;
			System.out.println(name + " is running at: ");
			if (length > runLimit)
				return runLimit;
			else if (length <= runLimit && length > 0)
				super.runLimit = 200;
			System.out.println(super.name + " is running at: ");
			if (length > super.runLimit)
				return super.runLimit;
			else if (length < super.runLimit && length > 0)
				return length;
			else
				throw new IllegalStateException("Error: Integers can't have negative value");
		}

		public static class Plate
		{
			public Plate(int i)
			{
			}
		}
	}
	public class Plate
	public class Plate
	{
		public static int food;
		public static int food;

		public Plate(int food)
		{
			this.food = food;
		}

		public Plate(int food)
		{
			this.food = food;
		}

		public boolean eat(int eatFood)
		{
			if (Plate.food > appetite & Plate.food > 0)
			{
				System.out.println(name + " is eating");
				Plate.food = Plate.food - appetite;
				appetite = appetite - eatFood;
				chAppetite();
				return true;
			} else
			{
				System.out.println("Food isn't enough in plate! " + Cat.name + " can't eat");
				return false;
			}
		}

		public boolean chAppetite()
		{
			if (Animals.appetite == 0)
			{
				System.out.println(super.name + " is full");
				return true;

			} else
				System.out.println(name + " isn't full");
			return false;
		}
	}





