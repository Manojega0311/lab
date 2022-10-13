//wrp to demo Exception demo
//Mnaovadhana M CG BATCH 2576
import java.util.*;
public class Exceptiondemo1
{
	public static void main(String[]args)
	{
		try
		{
			try
			{
			String s1= null;
			System.out.println(s1.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("String is null");
			}
			try{
				int[] x= {50,60,30};
				System.out.println(x[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("index not found");
			}
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");
			}
			System.out.println("hello...");
		}
		
	}
