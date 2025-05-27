package java017_collection.part05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//배열: length 키워드
//
//문자열 : length( )메소드
//컬렉션 : size() 메소드
//
//컬렉션 클래스를 선언하고 생성할 때 제너릭 타입을 선언한다.
//제너릭 타입을 선언하면 컬렉션 클래스에 저장된 객체를 가져올 때 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.

import java.util.Vector;

public class Java184_Vector {
	public static void main(String[] args) {
		String path = "./src/java017_collection/part05/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);
	}// end main()

	private static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후
		// 리턴하는 프로그램을 구현하시오.
		Vector<Sawon> vt = new Vector<Sawon>();
		
		Scanner sc = null;
		try (Scanner sc = new Scanner(new File(fileName));){
			sc = new Scanner(new File(fileName));
			while(sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//				break;
				String[] data =sc.nextLine().split("[:/]");
				Sawon sn = new Sawon(data[0],
						Integer.parseInt(data[1]),
						Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
				vt.add(sn);
				
			}	
		} catch (FileNotFoundException e) {	// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		
		return vt;
	}// end lines()

	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
		for(Sawon sn:vt)
			System.out.println(sn.toString());
	}// end prnDisplay()

}// end class
