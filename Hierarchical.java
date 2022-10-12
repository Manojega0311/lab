//wrp to demo inheritance
//Manovadhana M CG BATCH 2576
import java.io.*;
import java.lang.*;
import java.util.*;
class Person
{
	int pid;
	String pname;
	Person()
	{
	pid = 7;
	pname = "Yalzhan";
	}
}
class Student extends Person
{
	double studentmarks;
	void student()
	{
		studentmarks = 75;
		System.out.println("Student marks is");
	}
}
class Emp extends Person
{
	double salary;
	void emp()
	{
		salary = 15000;
		System.out.println("Emp salary is");
	}
}
class  Hierarchical
{
	public static void main(String[]args)
	{
		MainPerson p = new MainPerson();
		Student s = new Student();
		Emp e = new Emp();
	}
}