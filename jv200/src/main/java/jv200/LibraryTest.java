package jv200;

public class LibraryTest {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook(new Book("어린왕자", 10));
		System.out.println(lib.getBook(10));
	}
}

