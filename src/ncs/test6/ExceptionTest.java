package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int num = sc.nextInt();

		try {
			Calculator cal = new Calculator();
			double res = cal.getSum(num);
			System.out.println("결과값 : " + res);
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
