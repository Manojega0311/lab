//wrp to student details usig Scaner class 
//Manovadhana M-CG batch 2576
import java.util.Scanner;
class StudentDetails
{ 
public static void main(String[]args)
{
int id;
String name;
double att;
System.out.println("Enter Student Details");
Scanner SC=new Scanner(System.in);
id=SC.nextInt();
name=SC.next();
att=SC.nextDouble();
System.out.println(id+" "+name+" "+att);
}
}