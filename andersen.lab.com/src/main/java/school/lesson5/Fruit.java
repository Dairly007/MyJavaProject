package school.lesson5;

import java.util.ArrayList;

public abstract class Fruit<F> extends Box
{
	protected F[] fruit;
	protected float weight;
	protected int amount;

	public abstract F setFruit(F[] fruit);
	public abstract F getFruit();
	public abstract float setWeight(float weight, int amount);
	public abstract float getWeight(float weight, int amount);

}
