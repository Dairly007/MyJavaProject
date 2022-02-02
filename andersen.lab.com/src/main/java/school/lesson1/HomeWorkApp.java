package school.lesson1;

public class HomeWorkApp
{
	public static void main(String[] args)
	{
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	public static void printThreeWords()
	{
		String a = "Orange\n";
		String b = "Banana\n";
		String c = "Apple\n";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);  // ????? ? ???? ?????? ???? System.out.printf("%s%n%s%n%s%n",a, b, c);
	}
	public static void checkSumSign()
	{
		int a = 1;  // ????????????? ?????????? ???????? = (int) (Math.random()*(200+1) - 100);
		int b = 2;
		int c = a + b;
		if(c >= 0)
			System.out.println("????? ?????????????\n");
		else
			System.out.println("????? ?????????????\n");
	}
	public static void printColor()
	{
		int value = 100000;
		if(value <= 0)
			System.out.println("???????\n");
		if(value <= 100 && value > 0)
			System.out.println("??????\n");
		else if(value > 100)
			System.out.println("???????\n");
	}
	public static void compareNumbers()
	{
		int a = 1;
		int b = 2;
		if(a >= b)
			System.out.println("a >= b");
		else
			System.out.println("a < b");
	}
}
