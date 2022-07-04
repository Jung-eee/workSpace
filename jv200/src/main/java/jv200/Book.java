package jv200;

public class Book {
	private int serial;
	private String name;
	
	public Book(String name, int serial) {
		this.serial = serial;
		this.name = name;
	}
	
	public String getSerial() {
		return Integer.toString(serial);

	}
	
	public String getName() {
		return name;
	}
}
