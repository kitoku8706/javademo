package java001_basic.prob;

/*
 * num변수의 절대값을 출력하는 프로그램을 구현하시오.
 * [실행결과]
 * 10
 */

public class Prob02 {

	public static void main(String[] args) {
		int num = -10;
		//여기에 작성하시오.
		int res;
		res = num * 1 > 0 ? num : -num;
		System.out.println(res);
		
		
	}

}
