package Java_76_Challenges_Question;

public class Challenge_51_Book_Library_System 
{
	static int totalBooks;
	String title;
	String author;
	String isbn;
	boolean isBorrowed;
	static
	{
		totalBooks=0;
	}
	{
		totalBooks++; 
	}
	Challenge_51_Book_Library_System(String title,String author,String isbn)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	Challenge_51_Book_Library_System(String isbn)
	{
		this("Unknown","Unknown",isbn);
	}
	static int getTotalBooks()
	{
		return totalBooks;
	}
	void borrowBook()
	{
		if(isBorrowed)
		{
			System.out.println("Book Is Already Borrowed");
		}
		else
		{
			this.isBorrowed=true;
			System.out.println("Enjoy The Book "+this.title);
		}
	}
	void returnBook()
	{
		if(isBorrowed)
		{
			this.isBorrowed=false;
			System.out.println("Hope You Enjoyed, Please Leave A Review");
		}
		else
		{
			System.out.println("This Is A Already In The Library");
		}
	}
	public static void main(String[] args)
	{
		Challenge_51_Book_Library_System object=new Challenge_51_Book_Library_System("Design","K.P.Singh","1");
		Challenge_51_Book_Library_System object1=new Challenge_51_Book_Library_System("2");
		System.out.println(Challenge_51_Book_Library_System.totalBooks);
		object.borrowBook();
		object1.borrowBook();
		object.borrowBook();
//		object1.returnBook();
		object.returnBook();
		object1.returnBook();
	}
}
