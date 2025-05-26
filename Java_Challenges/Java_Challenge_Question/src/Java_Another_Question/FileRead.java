package Java_Another_Question;
import java.io.FileReader;
import java.io.IOException;
public class FileRead 
{
	public static void main(String[] args)
	{
		String filename="example.txt";
		try(FileReader reader=new FileReader(filename))
		{
			int read=0;
			do
			{
				read=reader.read();
				System.out.print((char)read);
			}
			while(read!=-1);
		}
		catch(IOException exception)
		{
			System.out.println("Exception Occurred "+exception.getMessage());
		}
	}
}
