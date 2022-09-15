//wrp to demo Largest numbers
//Manovadhana M CG 2576

import java.util.Scanner;

class LargestNumber

{

public static void main(String[]args)

{

int a, b,c,Largest,temp;

Scanner SC=new Scanner(System.in);

System.out.println("Enter the first number:");

a=SC.nextInt();

System.out.println("Enter the second number:");

b=SC.nextInt();

System.out.println("Enter the third number:");

c=SC.nextInt();

temp=a>b?a:b;

Largest=c>temp?c:temp;

System.out.println("The Largest number is:" +Largest);

}

}