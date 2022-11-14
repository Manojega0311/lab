//Create Login page
//Manovadhana M CG BATCH 2576
package airline;
import java.lang.*;
import java.util.*;
class InvalidUserException extends Exception
{
	public void InvalidUserException()
	{
		
	}
}
public class Login
{
	public void validate()throws InvalidUserException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter password:");
		String password = sc.next();
		
		
		
		if(id!=06 && password!="jega");
		
		
		     throw new InvalidUserException();
			 
			 
		else 
			
			System.out.println("Enter to book flight");
			
			
			
	}
	public static void main(String[]args)throws InvalidUserException
	{
		
		
		Login 1=new Login();
		1.validate();
	}
}