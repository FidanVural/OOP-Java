package lab3;

public class Book {
	private String book_name;
	private String author;
	
	public Book(String book_name, String author) {
		this.book_name = book_name;
		this.author = author;
	}

	public String getBook_name() {
		return book_name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [book_name=" + book_name + ", author=" + author + "]";
	}
	
}
