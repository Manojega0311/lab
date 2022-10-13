//wrp to demo user defined exception
//Manovadhana M CG BATCH 2576
class MyException extends Exception{
	
}
	public class SetText
	{
		public static void main(String[]args)
		{
			try
			{
				throw new MyException();
			}
			catch(MyException ex)
			{
				System.out.println("first exception program");
				System.out.println(ex.getMessage());
			}
		}
	}