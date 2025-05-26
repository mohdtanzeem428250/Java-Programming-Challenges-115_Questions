package Challenge_88_FileNotFoundExceptions;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileNotFound 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter The Name Of The File You Wish To Read : ");
		String filename=scanner.next();
		try(FileReader reader=new FileReader(filename))
		{
			int read1;
			while((read1=reader.read())!=-1)
			{
				System.out.print((char)read1);
			}
		}
		catch(FileNotFoundException exception)
		{
			System.out.println("File Does Not Exists "+exception.getMessage());
		}
		catch(IOException exception)
		{
			System.out.println("File Does Not Exists "+exception.getMessage());
		}
	}
}
