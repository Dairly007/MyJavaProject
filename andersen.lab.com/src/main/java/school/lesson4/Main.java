package school.lesson4;

import java.util.ArrayList;

public class Main
{


	public static void main(String[] args)
	{
		Dog dogi = new Dog("dogi", 500, 10, 95);
		Cat[] cats = new Cat[4];
		Cat cat0 = new Cat("Barsik", 200, 0, 100);
		Cat cat1 = new Cat("Bob", 200, 0, 100);
		Cat cat2 = new Cat("Koko", 200, 0, 100);
		Cat cat3 = new Cat("Bobiki", 200, 0, 100);
		Cat cat4 = new Cat("Konec", 200, 0, 100);
		Cat[] kitty = {cat0, cat1, cat2, cat3, cat4};
		Animals.Plate.food = 3000;
		System.out.println(dogi.run(50));
		System.out.println(dogi.swim(10));
		for(int i = 0;i <= cats.length;i++)
		{
			System.out.println(kitty[i].swim(10));
			System.out.println(kitty[i].run(10));
			System.out.println(kitty[i].eat(100));
		}
		System.out.println(Animals.Plate.food);
	}
}
