//create passenger detail using setter ,getter methods
//Manovadhana M CG BATCH 2576
package airline3;
import java.lang.*;
import java.util.*;
import java.util.Scanner.*;

class InvalidUserIdException extends Exception
{
	public void InvalidUserIdException()
	{
	}
}
 public class Passenger
{
	private int bookid;
	private int passengerid;
	private String pname;
	private int age;
	private String booking_status;
	void setBookid(int x)
	{
		bookid=x;
	}
	int getBookid()
	{
		return bookid;
	}
	
	void setPassengerid(int x)
	{
		passengerid=x;
	}
	int getPassengerid()
	{
		return passengerid;
	}
	
	void setPname(String x)
	{
		pname=x;
	}
	String getPname()
	{
		return pname;
	}
	
	void setAge(int x)
	{
		age=x;
	}
	int getAge()
	{
		return age;
	}
	
	void setBooking_status(String x)
	{
		booking_status=x;
	}
	String getBooking_status()
	{
		return booking_status;
	}
	public String toString()
	{
		return bookid+ " "+passengerid+ " " +pname+ " "+age+" " +booking_status;
	}
	
	
	 public void check(int id)throws InvalidUserIdException
	{
		
			
		if(id!=bookid)
			throw new InvalidUserIdException();
			
		else
			System.out.println("valid user id");
		
		
	}
	


	public static void main(String[] args)throws InvalidUserIdException
	{
		
		
		Passenger p=new Passenger();
		ArrayList<Passenger> a=new ArrayList<Passenger>();
		p.setBookid(7);
		p.setPassengerid(10);
		p.setPname("jega");
		p.setAge(23);
		
		p.setBooking_status("conform");
		System.out.println("Bookid:"+p.getBookid());
		System.out.println("passengerid:"+p.getPassengerid());
		System.out.println("passenger name:"+p.getPname());
		System.out.println("Age:"+p.getAge());
		System.out.println("Booking status:"+p.getBooking_status());
		a.add(p);
		for(Passenger ob:a)
		{
			System.out.println(ob);
		}
		
		ArrayList<Passenger> al=new ArrayList<Passenger>();
		p.setBookid(8);
		p.setPassengerid(11);
		p.setPname("mano");
		p.setAge(23);
		p.setBooking_status("conform");
		al.add(p);
		al.addAll(a);
		System.out.println("ADD THE PASSENGER DETAILSIN THE ARRAYLIST:");
		
		
		for(Passenger obj:al)
		{
			System.out.println(obj);
		}
		
		ArrayList<Passenger> al1=new ArrayList<Passenger>();
		p.setBookid(9);
		p.setPassengerid(12);
		p.setPname("yalzhan");
		p.setAge(47);
		p.setBooking_status("conform");
		al1.addAll(al);
		
		
		
		
		for(Passenger obj1:al1)
		{
			System.out.println(obj1);
		}
		System.out.println("add another details in arraylist");
		al.addAll(al1);
		for(Passenger obj:al)
		{
			System.out.println(obj);
		}
		
		al.remove(0);
		
		
		System.out.println("DELETE THE PASSENGER DETAILS FROM  THE ARRAYLIST:");
		
		
		
		for(Passenger obj:al)
		{
			System.out.println(obj);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book id");
		int id=sc.nextInt();
		
		
		p.check(id);
		
		
		
	}
}