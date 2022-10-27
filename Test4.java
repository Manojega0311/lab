//wrp to demo  printwriter class and store different data details into one file
//Manovadhana M CG BATCH 2576
import java.io.*;
class Test4
{
	public static void main(String[]args)
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("abc.txt");
			String s = "Virat is my favourite player";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success...");
		}catch(Exception e){System.out.println(e);}
		
		
		}
		
	}
