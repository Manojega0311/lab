//wrp to demo package into another pakage
//Manovadhana M  CG BATCH 2576
package Anudip;
import java.util.*;
class Customer
{
	int acno;
	String atype;
	double amnt;
	Customer()
	{
		acno = 63125523;
		atype = "saving";
		amnt = 50000;
	}
 Customer details(String x, double y)
{
	atype = x;
	amnt = y;
}
Customer details(int z, double y)
{
	amnt = y;
	acno = z;
}

void show()

{
	System.out.println(acno+" "+atype+" "+amnt);
	
}
}
public class Bankcustomer
{
	public static void main(String[]args)
	{
		BankCustomer m1 = new BankCustomer();
		BankCustomer m2 = new BankCustomer("current",63125523);
		BankCustomer m3 = new BankCustomer(30000,50000);
		m1.show();
		m2.show();
		m3.show();
	}
}
		
	