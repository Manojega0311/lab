//wrp to demo constrcutor,named method,static method in one program
//Manovadhana M CG BATCH 2576
import java.util.*;
class EmpDetails
{
	int eid;
	String ename;
	double esalary;
	static String cname = "zoho";
	static void change()
	{
		cname = "zoho";
	}
	EmpDetails(int x, String y, double z)
	{
		eid = x;
		ename = y;
		esalary = z;
	}
	void show()
	{
		System.out.println(eid+" "+ename+" "+esalary);
		
	}
}
public class Employees
{
	public static void main(String[]args)
	{
		Employees e1 = new Employees(1,"Shravani",45000);
		Employees e2 = new Employees(2,"kavishka",47000);
		Employees e3 = new Employees(3,"Jegathees",52000);
		Employees.change();
		e1.show();
		e2.show();
		e3.show();
		
		}
}

