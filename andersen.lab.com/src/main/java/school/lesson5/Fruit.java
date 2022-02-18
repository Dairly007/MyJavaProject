package school.lesson5;

public class Fruit<A,O>
{
	protected A apples;
	protected O oranges;
	protected int weight;


	public Fruit(A apples, O oranges)
	{
		this.apples = apples;
		this.oranges = oranges;
	}

	public A getApples()
	{
		return apples;
	}
	public O getOranges(){
		return oranges;
	}

	public int setWeight(int weight[])
	{
		return 0;
	}

	public int weight(int weight[])
	{
		return 0;
	}
}
