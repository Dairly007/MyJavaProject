package school.lesson5;

public abstract class Fruit<T>
{
	protected T[] objType;
	protected int weight;


	public T setType(Object[] objType)
	{
		this.objType = (T[]) objType;
		return null;
	}

	public T getType(T[] objType)
	{
		return null;
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
