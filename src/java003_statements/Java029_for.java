package java003_statements;

// sum=55

public class Java029_for {

	public static void main(String[] args) {
		// 1~10까지 합계를 구하는 프로그램 구현
		int sum = 0;
		int i;

		for (i = 1;; i++) {
			sum = sum + i;
//			System.out.println(i);			
			System.out.printf("i=%d, sum=%d\n",i,sum);
			if (i >= 10) {
				break; // 반복문 for문을 강제적으로 빠져나옴
			}
		}
		System.out.printf("sum=%d\n", sum);

//		System.out.printf("i=%d,sum=%d\n", i, sum);

//		int sum=0;
//		
//		for(int i = 1; i <=10;, i++) {
//			sum = sum+i; // sum+=1
//		}			
//		System.out.println("sum=",+sum);
		
		
	} // end main

} // end class