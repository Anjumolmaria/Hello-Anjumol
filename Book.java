
public class Book 
{
	String bookId;
	String bookName;
	String authorsName;
	String publisherName;

	Book(String Id ,String name  ,String author,String publish)//constructor
	{
		bookId=Id;
		bookName=name;
		authorsName=author;
		publisherName=publish;
	}
	
	public void setBookId(String Id)//setter methods
	{
		bookId=Id;
		
	}
	
	public void setBookName(String name)
	{
		bookName=name;
	}
	
	public void setAuthor(String author)
	{
		authorsName=author;
	}
	
	public void setPublisher(String publish)
	{
		publisherName=publish;
	}
	
	
	public String getPublisher()//getter methods
	{
		return publisherName;
	}
	
	public String getAuthor()
	{
		return authorsName;
	}

	public String getBookId()
	{
		return bookId; 
	}
	
	public String getBookName()
	{
		return bookName;
		
	}
	public void displyDetails()
	{   
		System.out.println("The book is present");
		System.out.println("The Book id  "+bookId );
		System.out.println("The Book name is "+bookName);
		System.out.println("The Author name is "+authorsName);
		System.out.println("The publisher is  "+publisherName);
	}
	
	

		
}

	
	
	
	
	
	
	
	
	
	
	
	

