package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library mang = new Library();
		System.out.println(mang.addBook("The Golden Fish"));
		mang.issueBook();

	}

}
