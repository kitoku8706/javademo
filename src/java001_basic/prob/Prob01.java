package java001_basic.prob;

/*
 * num변수의 값이 10의 배수이면 1을 아니면 0을 
 * res변수에 리턴하는 프로그램을 구현하시오.
 * [실행결과]
 * res=0
 */
public class Prob01 {

	public static void main(String[] args) {
		int num = 10;
		int res;

		// 여기에 작성하세요.
		res = num % 10 == 0 ? 1 : 0;
		// num % 10 ==0 나머지가 0 인가 참은 1 거짓은 0으로 값을 산출
		
		
		
		System.out.println("num = "+num);
		System.out.println("를 10으로 나누면");
		System.out.println("몫은 = "+num / 10);
		System.out.println("나머지는 = "+num % 10);
		System.out.println("res = 나머지가 0 이면 1 0이 아니면 0으로 값을 산출");
		System.out.println(res);
		
		
		
		
		
	}

}
