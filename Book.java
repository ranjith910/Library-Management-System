package LibraryManagement;

public class Book {
	private int bookId;
	private String bookTitle;
	private int cost;
	private int noOfPages;
	private String author;
	public Book()
	{
		
	}
	public Book(int bookId, String bookTitle, int cost, int noOfPages, String author) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.cost = cost;
		this.noOfPages = noOfPages;
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void bookDetails()
	{
		System.out.println("id of the book : "+bookId);
		System.out.println("Author of the book : "+author);
		System.out.println("Title of the book : "+bookTitle);
		System.out.println("pages : "+noOfPages);
		System.out.println("cost of the book : "+cost);
	}
	
}
