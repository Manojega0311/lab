//wrp to demo console class with password method
//Manovadhana M CG BATCH 2576
import java.io.*;
class ReadPasswordTest
{
	public static void main(String[]args)
	{
	Console c = System.console();
	System.out.println("Enter password:");
	char[]ch = c.readPassword();
	String pass = String.valueOf(ch);
	System.out.println("Password is:"+pass);
}
}