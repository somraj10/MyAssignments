package week1.day3;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook(){
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library obj = new Library();
		System.out.println(obj.addBook("Testleaf"));
		obj.issueBook();
	}
}
