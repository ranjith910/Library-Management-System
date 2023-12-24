package LibraryManagement;

import java.util.ArrayList;
import java.util.ListIterator;

public class Library {
	private String location;
	private Book b;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	ArrayList<Book> book=new ArrayList();
	
	//AddBook
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book added Successfully");
	}
	
	//DisplayBook
	public void displayBooks()
	{
		if(book.isEmpty())
		{
			throw new NoBookException();
		}
		else
		{
			for(Book b:book)
			{
				b.bookDetails();
			}
		}
	}
	
	//SearchBook by Id
	public void searchBookId(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBookException();
		}
		else
		{
			for(Book b:book)
			{
				if(b.getBookId()==id)
				{
					System.out.println("Book founded succesfully");
					b.bookDetails();
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	
	//Search by Id and Title
	public void searchBookByIdandTitle(int id,String title)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBookException();
		}
		else
		{
			for(Book b:book)
			{
				if(b.getBookId()==id)
				{
					if(b.getBookTitle().equals(title))
					{
						System.out.println("Book founded Succsefully");
						b.bookDetails();
						isFound=true;
					}
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	
	//UpdateBook by Id
	public void updateBookData(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBookException();
		}
		else
		{
			for(Book b: book)
			{
				if(b.getBookId()==id)
				{
					b.setCost(900);
					System.out.println("Book cost Updated");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	
	//RemoveBook by Id
	public void removeBookById(int id)
	{
		ListIterator<Book> i=book.listIterator();
		boolean isRemoved=false;
		if(book.isEmpty())
		{
			throw new NoBookException();
		}
		else
		{
			while(i.hasNext())
			{
				Book b1=i.next();
				if(b1.getBookId()==id)
				{
					i.remove();
					System.out.println("Book removed succesfully");
					isRemoved=true;
				}
			}
		}
	}
}
