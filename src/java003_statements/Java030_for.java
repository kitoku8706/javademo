package java003_statements;

//1~10까지 짝수, 홀수 누적을 계산하는 프로그램
//
//[출력결과]
//홀수누적:25
//짝수누적:30
//



public class Java030_for {

	public static void main(String[] args) {
		int odd = 0;  // 홀수누적
		int even = 0;  // 짝수누적
		
		for(int i = 1; i <=10; i++) {
			if(i%2==1) {    // i%2 나머지가 1이면
				odd = odd+i;  // 홀수누적
			}else {
				even = even+i; //짝수누적
			}
		}
		
		System.out.printf("홀수누적 :%d\n",odd);
		System.out.printf("짝수누적 :%d\n",even);
					
//		System.out.printf("홀수누적:"+odd);
//		 
//		System.out.printf("짝수누적:"+even);		
		
		
	} // end main

} // end class
