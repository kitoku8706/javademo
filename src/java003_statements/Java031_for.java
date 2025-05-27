package java003_statements;

/*
 * 3의 배수만 제외하는 프로그램 구현
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 */

public class Java031_for {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
				//1씩증가  i++, i=i+1, i+=1
			
			if(i%3!=0) {
				//i%3==0 i를 3으로 나누면 나머지가 0이다 // 3의 배수 
				//i%3!=0 3의 배수제외
				
				System.out.println(i);
			}
		}
			

			

	}//end main()

}//end class
