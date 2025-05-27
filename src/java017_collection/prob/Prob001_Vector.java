package java017_collection.prob;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/*
 * [문제] : booklist.txt 파일의 데이터를 이용하여 
 *      책 정보 하나당 하나의 Book 객체를 생성하고 생성된 Book 객체들을 
 *      Vector에 담아서 리턴하는 makeBookList() 메서드를 구현하시오.
 *      
 * [실행결과]
 * Java Programming 의 가격 : 25000
 * SQL Fundamentals 의 가격 : 47000
 * JDBC Programming 의 가격 : 30000
 * Servlet Programming 의 가격 : 20000
 * JSP Programming 의 가격 : 21000
 */
public class Prob001_Vector {

	public static void main(String[] args) throws Exception {
		Vector<Book> bookList = makeBookList();
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " 의 가격 : " + book.getPrice());
		}

	}// end main()

	private static Vector<Book> makeBookList() throws Exception {
		// booklist.txt 파일의 데이터를 Vector에 저장한 후 리턴하는 프로그램을 구현하시오.
	  
		Vector<Book> v = new Vector<Book>();
		try(Scanner sc = new Scanner(new File(".\\src\\java017_collection\\prob\\booklist.txt"));){
		while(sc.hasNextLine()) {
			String[] line = sc.nextLine().split("/");
			Book book = new Book(line[0],line[1],line[2],line[3]);
			v.add(book);
		}
		sc.close(); // throws Exception 선언되어 있어서 안해도 무방, try~catch 선언되어서 생략되었음
		}catch (IOException ex	) {
			System.out.println(ex.toString());
		}
	     
		
		
		
		
		
		return v;   // return 값은 하나만 가능해서 vector 값으로 묶음
	}// end makeBookList()

}// end class















