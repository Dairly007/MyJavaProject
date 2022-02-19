package school.lesson4;

import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		Dog dogi = new Dog();
		Cat kitty = new Cat();
		dogi.animal("dogi", 100, 95);
		kitty.animal("kitty",100,8);
		System.out.println(dogi.run(100));
		System.out.println(dogi.swim(100));
		System.out.println(kitty.swim(100));
		System.out.println(kitty.run(100));
	}

}
