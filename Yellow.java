//wrp to demo multiple inheritance
//Manovadhana M CG BATCH 2576
import java.util.*;

public interface Red
{
	void show();
		System.out.println("red color");
	}

public interface Green
{
	void show();
		System.out.println("green color");
	}
public class Yellow implements Red,Green
{
	public void show();
	{
		System.out.println("rose is red");
	}
	public void show1()
	{
		System.out.println("tree is green");
	}
	public static void main(String[]args)
	{
		Yellow c1 = new Yellow();
		c1.show();
		c1.show1();
	}
}
