package school.lesson5;

import java.util.Arrays;

public class Apple<F extends Fruit>
{
	int amount;
	String a;

	public Apple(String a)
	{
		this.a = a;
	}

	public static void main(String[] args)
	{
		Apple a0 = new Apple("russia");
		Apple a1 = new Apple("usa");
		Apple aTmp = new Apple("swap");
		Apple a[] = {a0, a1};
		System.out.println(Arrays.deepToString(a));
		Apple tmp = a[1];
		Apple tmp1 = a[0];
		a[0] = a[1];
		a[1] = tmp1;
		System.out.println(Arrays.deepToString(a));
	}
}