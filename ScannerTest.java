//Wrp to demo to input using Scanner class
//Manovadhana M CG BATCH 2576
import java.util.Scanner;
class ScannerTest
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your rollno");
		int rollno = sc.nextInt();
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your fees");
		double fees = sc.nextDouble();
		System.out.println("Rollno:"+rollno+"name:"+name+"fees:"+fees);
		sc.close();
	}
}