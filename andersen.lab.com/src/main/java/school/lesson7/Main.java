package school.lesson7;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		AppData appData = new AppData();
		appData.load("C:\\Users\\Dairly\\IdeaProjects\\JavaProject\\" +
				"myJavaProject\\andersen.lab.com\\src\\main\\java\\school\\lesson7\\test.csv");
		String[] header1 = new String[]{"odin", "dva", "tri"};
		int[][] data1 = {{1, 2, 3, 4}, {11, 22, 33, 44},
				{111, 222, 333, 444}, {1111, 2222, 3333, 4444}};
		AppData appData1 = new AppData(header1, data1);
		appData1.setHeader(header1);
		appData1.setData(data1);
		System.out.println(Arrays.toString(appData.getHeader()));
		System.out.println(Arrays.deepToString(appData.getData()));
		appData1.save(data1);
	}

}