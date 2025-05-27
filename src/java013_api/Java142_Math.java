package java013_api;

import static java.lang.Math.*;

public class Java142_Math {

	public static void main(String[] args) {
		double a = 25.367;    //25.4
		double b = 268.35;    //270
		
		System.out.println((double)round(a*10) / 10); // 소수점 첫째자리 반올림
		System.out.println(round(b/10)*10);  //  일의 자리에서 반올림
		

	}//end main()

}//end class


