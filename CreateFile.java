//wrp to demo File Writter
//Manovadhana M CG BATCH 2576
import java.io.FileWriter;
import java.io.IOException;
class CreateFile
{
	public static void main(String[]args) throws IOException
	{
		String str = "File handling in java using "+"FileWriter and FileReader";
		FileWriter fw = new FileWriter("output.txt");
		for(int i = 0;i<str.length();i++)
		fw.write(str.charAt(i));
	System.out.println("Writing Successful");
	fw.close();
	
	}
}
