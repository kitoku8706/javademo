package java013_api;

import java.util.Scanner;

//java.util.Scanner : jdk5에서 추가되었음
public class Java145_Scanner {
	
	public static void main(String[] args) {
		// 콘솔창으로 데이터를 읽어오기위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름:");
		
		//sc.next(): 콘솔창으로 부터 데이터를 입력받기 위해서 대기상태가 되며
		//사용자 데이터를 입력하고 Enter을 하면
		//next() 메소드에서 읽는다.
//		String name = sc.next();
		String name = sc.nextLine();  //한라인을 읽는다.
		System.out.println(name);

	}//end main()

}
