package Challenge_80_LibraryItems_Inheritance;

public class LibraryItems 
{
	private String itemsID;
	private String title;
	private String author;
	
	public String getItemsID() {
		return itemsID;
	}
	public void setItemsID(String itemsID) {
		this.itemsID = itemsID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void checkOut()
	{
		System.out.println("Check Out");
	}
	public void returnItems()
	{
		System.out.println("Returning The Items");
	}
}
