import java.util.*;
class StudentDetails
{
	int sid;
	String sname;
	double marks;
}
public class Student
{
	public static void main(String[]args)
	{
		StudentDetails s1 = new StudentDetails();
		s1.sid = 6;
		s1.sname = "Shravni";
		s1.marks = 90;
		System.out.println(s1.sid+" "+s1.sname+" "+s1.marks);
	}
}