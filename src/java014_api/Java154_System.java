package java014_api;

import java.text.SimpleDateFormat;

import javax.lang.model.util.SimpleAnnotationValueVisitor14;

public class Java154_System {
	
	public static void main(String[] args) {
		System.out.println(60*60*24);
		
		//currentTimeMillis(): 1970.1.1 부터 초단위로
		// 누적한 값을 밀리센컨트 리턴한다.
		// 밀리초(millisecond, js)는 천분의 1초(1/1000)를 의미한다.
		long curr = System.currentTimeMillis();
		System.out.println(curr);
		
		// HH:24 hh:12 a:오전/오후 EEEE:금요일 EEE:금
		// MM: 월  mm : 분
		String pattern = "yyyy-MM-dd HH:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String deteTime = sdf.format(curr);
		System.out.println(deteTime);
		

	}//end main()

}
