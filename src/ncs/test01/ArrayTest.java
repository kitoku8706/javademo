package ncs.test01;

//출력 결과는 다음과 같다. 소수점 아래 둘째자리까지 출력되게 한다.
//합계 : 767.00
//평균 : 38.35  
//합계와  평균  값은 double로 처리한다.


public class ArrayTest {
	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
//		int sn= array[i][j];
		double hab = 0;
		
		
//		System.out.println(array[1][4]);
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<5;j++) {
				hab += array[i][j];
			}
		}
		double avg = hab/(array.length*5);
		
		System.out.printf("합계 : %.2f\n",hab);
		System.out.printf("평균 : %.2f\n",avg);
	}//end main()

}
