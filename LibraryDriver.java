package LibraryManagement;

import java.util.Scanner;

public class LibraryDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		boolean start=true;
		while(start)
		{
			System.out.println(" Enter the Choice \n1.AddBook \n2.DisplayBook"
					+ " \n3.SearchBookById and Title \n5.UpdateBook \n6.RemoveBook "
					+ "\n7.Exit");
			
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter the BookId :");
				int bookId=sc.nextInt();
				System.out.println("Enter the Book Title : ");
				String BookTitle=sc.next();
				System.out.println("Enter the Book Cost : ");
				int cost=sc.nextInt();
				System.out.println("Enter the authorName : ");
				String author=sc.next();
				System.out.println("Enter the noOfPages : ");
				int noOfPages=sc.nextInt();
				l.addBook(new Book(bookId,BookTitle,cost,noOfPages,author));
			}
			break;
			case 2:
			{
				l.displayBooks();
			}
			break;
			case 3:
			{
				System.out.println("Enter the book id");
				int bookId=sc.nextInt();
				l.searchBookId(bookId);
			}
			break;
			case 4:
			{
				System.out.println("Enter the book id");
				int bookId=sc.nextInt();
				System.out.println("Enter book title");
				String bookTitle=sc.next();
				l.searchBookByIdandTitle(bookId, bookTitle);
			}
			break;
			case 5:
			{
				System.out.println("Enter your bookId");
				int bookId=sc.nextInt();
				l.updateBookData(bookId);
			}
			break;
			case 6:
			{
				System.out.println("Enter the book Id");
				int bookId=sc.nextInt();
				l.removeBookById(bookId);
			}
			break;
			case 7:
			{
				start=false;
				System.out.println("Thank you...");
			}
			break;
			default:
				System.out.println("Enter valid choice");
			}
		}
	}
}
