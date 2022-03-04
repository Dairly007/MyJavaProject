package school.lesson7;


import java.awt.datatransfer.Clipboard;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.in;
import static java.lang.System.out;

public class AppData
{
	private String[] header;
	private static int[][] data;

	public AppData(String[] header, int[][] data)
	{
		super();
		this.header = header;
		this.data = data;
	}
	public AppData(){
		super();
	}

	public String[] getHeader()
	{
		return header;
	}
	public void setHeader(String[] header)
	{
		this.header = header;
	}

	public static int[][] getData()
	{
		return data;
	}

	public void setData(int[][] data)
	{
		this.data = data;
	}
	public void load(String file) throws FileNotFoundException
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String string;
			while ((string = br.readLine()) != null)   {
				System.out.println (string);
			}
			in.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void save(int[][] data){

	try
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("test1.csv"));
		out.deepToString(getData(data));;


	} catch (IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		out.close();
	}
	}

}