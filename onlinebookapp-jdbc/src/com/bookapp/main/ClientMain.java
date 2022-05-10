package com.bookapp.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bookapp.bean.Book;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class ClientMain {
	public static  void admin() {
		System.out.println("Select the operation");
		System.out.println("1.Add Books");
		System.out.println("2.Delete Book");
		System.out.println("3.Update Book");
		
	}

	public static void user() {
		System.out.println("Select the operation");
		System.out.println("1.Get all Books");
	    System.out.println("2.Get Book By ID");
		System.out.println("3.Get Book By Author");
		System.out.println("4.Get Book By Category");
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		IBookService bookService = new BookServiceImpl();
		String choice =null;
		do {
			System.out.println("Do you want to continue....YES/NO");
			choice  = scanner.next();
			if(choice.equalsIgnoreCase("YES")) {
				
				System.out.println("Select the role");
				System.out.println("1.Admin");
				System.out.println("2.User");
				int role = scanner.nextInt();
				// Admin Operation
				if(role==1) {
					admin();
					int adminChoice = scanner.nextInt();
					switch(adminChoice) {
					case 1:
					    System.out.println("Enter Book id");
					    int bookId = scanner.nextInt();
					    System.out.println("Enter Title");
					    String title = scanner.next();
					    System.out.println("Enter Author");
					    String author  = scanner.next();
					    System.out.println("Enter Category");
					    String category = scanner.next();
					    System.out.println("Enter Price");
					    double price =scanner.nextDouble();
					    Book book = new Book();
					    book.setBookId(bookId);
					    book.setTitle(title);
					    book.setAuthor(author);
					    book.setCategory(category);
					    book.setPrice(price);
					    bookService.addBook(book);
						break;
					case 2:
						System.out.println("Enter Book id");
						int bookId1 = scanner.nextInt();
						bookService.deleteBook(bookId1);
						break;
					case 3:
						System.out.println("Enter Book Id");
						int bookId11 = scanner.nextInt();
						System.out.println("Enter price");
						double price1 = scanner.nextDouble();
						bookService.updateBook(bookId11, price1);
					    break;
				
					}
				}
				//User Operation
				else if(role==2) {
					user();
					int userChoice = scanner.nextInt();
					switch(userChoice) {
					case 1:
					List<Book>books=bookService.getAllBooks();
					for(Book book:books)
						System.out.println(book);
					break;
					case 2:
						Book book;
						System.out.println("Enter Book Id");
						int bookid = scanner.nextInt();
						book = bookService.getBookById(bookid);
						System.out.println(book);
						break;
					case 3:
						List<Book> bookByAuthor = new ArrayList<>();
						System.out.println("Enter Author");
						String author = scanner.next();
						bookByAuthor = bookService.getBookByAuthor(author);
						for(Book book1:bookByAuthor)
							System.out.println(book1);
						break;
					case 4:
						List<Book> bookByCategory = new ArrayList<>();
						System.out.println("Enter Category");
						String category = scanner.next();
						bookByCategory = bookService.getBookByCategory(category);
						for(Book book1:bookByCategory)
							System.out.println(book1);
						break;
						
						default:
							System.out.println("Invalid user operation...Please Enter valid one");
						break;
					}	
				}
				
				
			}
		}while(choice.equalsIgnoreCase("YES"));
		System.out.println("Thank you for using Book Application...");
	}

}
