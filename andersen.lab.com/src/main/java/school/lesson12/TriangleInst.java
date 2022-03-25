package school.lesson12;

import java.util.Random;

public class TriangleInst
{
	private static double sqr;
	private double a;
	private double b;
	private double c;
	private double p;

	public TriangleInst(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static double getSqr()
	{
		return sqr;
	}

	public static void setSqr(double sqr)
	{
		TriangleInst.sqr = sqr;
	}

	public double getA()
	{
		return a;
	}

	public void setA(double a)
	{
		this.a = a;
	}

	public double getB()
	{
		return b;
	}

	public void setB(double b)
	{
		this.b = b;
	}

	public double getC()
	{
		return c;
	}

	public void setC(double c)
	{
		this.c = c;
	}

	public double getP()
	{
		return p;
	}

	public void setP(double p)
	{
		this.p = p;
	}

	public double randomize(TriangleInst triangle)
	{
		Random rn = new Random();
/*		a = (int) rn.nextDouble(1, 100);
		System.out.println("CURRENT value A is:" + a);
		b = (int) rn.nextDouble(1, 100);
		System.out.println("CURRENT value B is:" + b);
		a = (int) rn.nextDouble(1, 100);
		System.out.println("CURRENT value C is:" + c);*/
		p = ((a + b + c) / 2);
		sqr = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println((int) sqr);
		return (int) sqr;
	}

/*	public double checkS() throws ArithmeticException
	{
		if (sqr == 0)
			System.out.println("Wrong value of sides - a,b,c");
		else
			System.out.println("Triangle true value of SQUARE is: " + sqr);
		return sqr;
	}*/

	public static void main(String[] args)
	{
		TriangleInst triangle1 = new TriangleInst(66, 67, 2);
		System.out.println("CURRENT value A is:" + triangle1.getA());
		System.out.println("CURRENT value B is:" + triangle1.getB());
		System.out.println("CURRENT value C is:" + triangle1.getC());
		triangle1.randomize(triangle1);
		System.out.println("CURRENT value A is:" + triangle1.getA());
		System.out.println("CURRENT value B is:" + triangle1.getB());
		System.out.println("CURRENT value C is:" + triangle1.getC());
/*		if ((int) sqr == 0)
		{
			triangle1.randomize(triangle1);
			System.out.println("Current value S is: " + sqr);
			if (Double.isNaN((sqr)))
			{
				triangle1.randomize(triangle1);
				System.out.println("Current value S is: " + sqr);
			}
		}
		triangle1.checkS();
	}*/
	}
}