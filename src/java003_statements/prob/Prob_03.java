package java003_statements.prob;

/*
1+1+2+1+2+3+1+2+3+4+1+2+3+4+5=??

출력결과
sum=35
*/

public class Prob_03 {

	public static void main(String[] args) {
		int sum = 0;
		for(int a=0;a<=5;a++) {
			for(int b=0;b<=a;b++)
			sum=sum+b;
		}
		System.out.printf("sum="+sum);
		
	}// end main()

}// end class
