//Book flight class
//Manovadhana M CG BATCH 2576
package airline2;
import java.lang.*;
import java.util.*;

public class BookFlight
{
	private int bookid;
	private int flightid;
	private String classtype;
	private String dateof_journey;
	private String dateof_booking;
	private int no_of_adults;
	private int no_of_children;
	private String gender;
	private int ticketfare;
	private int customerid;
	
	void setBookid(int x)
	{
		bookid=x;
	}
	int getBookid()
	{
		return bookid;
	}
	void setFlightid(int x)
	{
		flightid=x;
	}
	int getFlightid()
	{
		return flightid;
	}
	void setClasstype(String x)
	{
		classtype=x;
	}
	String getClasstype()
	{
		return classtype;
	}
	
    void setDateof_journey(String x)
	{
		dateof_journey=x;
	}
	String getDateof_journey()
	{
		return dateof_journey;
	}
	void setDateof_booking(String x)
	{
		dateof_booking=x;
	}
	String getDateof_booking()
	{
		return dateof_booking;
	}
	void setNo_of_adults(int x)
	{
		no_of_adults=x;
	}
	int getNo_of_adults()
	{
		return no_of_adults;
	}
	void setNo_of_children(int x)
	{
		no_of_children=x;
	}
	int getNo_of_children()
	{
		return no_of_children;
	}
	void setGender(String x)
	{
		gender=x;
	}
	String getGender()
	{
		return gender;
	}
	void setTicketfare(int x)
	{
		ticketfare=x;
	}
	int getTicketfare()
	{
		return ticketfare;
	}
	void setCustomerid(int x)
	{
		customerid=x;
	}
	int getCustomerid()
	{
		return customerid;
	}
	public String toString()
	{
		return bookid+" " +flightid+" " +classtype+" " +dateof_journey+" " +dateof_booking+" " +no_of_adults+" " +no_of_children+" " +gender+" " +ticketfare+" " +customerid;
	
	}
	public static void main(String[]args)
	{
		BookFlight b = new BookFlight();
		ArrayList<BookFlight> b1 = new ArrayList<BookFlight>();
		System.out.println("Enter the booking details:");
		b.setBookid(07);
		b.setFlightid(10);
		b.setClasstype("Economy class");
		b.setDateof_journey("Three days");
		b.setDateof_booking("nov three");
		b.setNo_of_adults(2);
		b.setNo_of_children(1);
		b.setGender("Female");
		b.setTicketfare(10000);
		b.setCustomerid(106);
		
		System.out.println("Bookid:" +b.getBookid());
		System.out.println("Flightid:" +b.getFlightid());
		System.out.println("classtype:" +b.getClasstype());
		System.out.println("dateof_journey:" +b.getDateof_journey());
		System.out.println("dateof_booking:" +b.getDateof_booking());
		System.out.println("no_of_adults:"  + b.getNo_of_adults());
		System.out.println("no_of_children:" + b.getNo_of_children());
		System.out.println("gender:" +b.getGender());
		System.out.println("ticketfare:" + b.getTicketfare());
		System.out.println("customerid:" + b.getCustomerid());
		System.out.println();
		
		b1.add(b);
		System.out.println("Store the details in collection using arraylist:");
		ListIterator itr=b1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}