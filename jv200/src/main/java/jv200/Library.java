package jv200;

public class Library {
	private static String[][] myBook = new String[100][2];
	private static int plusBook = 0;
	private String returnBook = "";
	
	public void addBook(Book book) {
		myBook[plusBook][0] = book.getName();
		myBook[plusBook][1] = book.getSerial();
		plusBook++;
	}
	
	public String getBook(int serial) {
		for (int i = 0; i < myBook.length; i++) {
			if(Integer.toString(serial).equals(myBook[i][1])) {
				returnBook = myBook[i][0];
			};
		}
		return returnBook;
	}
	
}


//예외처리
//try는 예외가 발생할 수 있을만한 코드
//catch 예외 발생시 처리할 코드 
//finally  예와 발생과 상관없이 처리할 코드