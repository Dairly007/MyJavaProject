package school.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeArr
{
	String name;

	public ChangeArr(String name)
	{
		this.name = name;
	}
	public static void changeArr  (ChangeArr[] arr, int a, int b){

		for (ChangeArr changeArr : arr)
		{
			System.out.println(changeArr.name);
		}
		ChangeArr tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		for (ChangeArr changeArr : arr)
		{
			System.out.println(changeArr.name);
		}
	}
	public static void main(String[] args)
	{
		ChangeArr a0 = new ChangeArr("Russia");
		ChangeArr a1 = new ChangeArr("USA");
		ChangeArr[] a = {a0, a1};
		changeArr( a, 0, 1);
		System.out.println((a[0].name));
	}

}
