//wrp to demo Encapsulation using private members
//Manovadhana M CG BATCH 2576
class EncapsulationDemo
{
	private int ssn;
	private String empName;
	private int empAge;
	public int getEmpSSN()
	{
		return ssn;
	}
    public String getEmpName()
{
	return empName;
}

	public int getAge()
	{
		return empAge;
	}
	public void setEmpAge(int newValue)
	{
		empAge=newValue;
	}
	public void setEmpName(String newValue)
	{
	empName=newValue;
}
    public void setEmpSSN(int newValue)
{
	ssn=newValue;
}

}
public class EncapsTest
{
	public static void main(String[]args)
	{
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpName("Jegathees");
		obj.setEmpAge(25);
		obj.setEmpSSN(112233);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee SSN: " + obj.getEmpSSN());
		System.out.println("Employee Age:" + obj.getEmpAge());
		
	}
}  


