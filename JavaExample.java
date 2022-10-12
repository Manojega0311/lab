//wrp to demo Hierarchial inheritance
//Manovadhana M CG BATCH 2576
class A
{
	public void methodA()
	{
		System.out.println("method of class A");
	}
}
class B extends A
{
	public void methodB()
	{
		System.out.println("method of class B");
	}
}
class C extends A
{
	public void methodC()
	{
		System.out.println("method of class C");
	}
}
class D extends A
{
	public void methodD()
	{
		System.out.println("method of class D");
	}
}
class JavaExample
{
	public static void main(String[]args)
	{
		B obj = new B();
		C obj = new C();
		D obj = new D();
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();
		
	}
}
