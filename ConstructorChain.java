//wrp to demo Constructor chaining
//Manovadhana M CG BATCH 2576

public class ConstructorChain
{

ConstructorChain()
{

this("java");

System.out.println("Default constructor called");

}

ConstructorChain(String str)

{

System.out.println("Parametarized constructor called");

}

public static void main(String[]args)

{

ConstructorChain cc = new ConstructorChain();

}

}
