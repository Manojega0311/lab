//wrp to demo Reverse a number
//Manovadhana M CG Batch 2576
class ReverseNumber

{

public static void main(String[]args)

{

int number=987653,reverse=0;

while(number!=0)

{

int remainder = number % 10;

reverse = reverse * 10 + remainder;

number = number/10;

}

System.out.println("The reverse of the given number is:" +reverse);

}

}
