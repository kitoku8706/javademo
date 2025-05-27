package java004_array;

//[데이터]

//홍길동   90  85 40
//이영희  100  35 75
//
//[출력결과]
//홍길동   90  85 40 215 71.7
//이영희  100  35 75 210 70.0

public class Java047_array {
//	public static void main(String[] args) {
//		String[] name = {"홍길동","이영희"};
//		int[][] jumsu = {{90,85,40}, {100,35,75}};
//		
//		int sum;    // 지역변수는 초기값이 없으면 비어 있음
//		double avg;
//		
//		for (int i=0; i<jumsu.length; i++) {
//			sum=0; // 누적시 필요 없으면 넘어가지 않음
//			System.out.printf("%s\t",name[i]);
//			for(int j=0; j<jumsu[i].length; j++) {
//				System.out.printf("%4d",jumsu[i][j]);
//				sum = sum + jumsu[i][j];
//			}
//			avg=sum/(double)jumsu[i].length;
//			System.out.printf("%4d %.1f\n",sum,avg);
//			
//		}
//		
//		
//		
//	}//end main()
	public static void main(String[] args) {
		String[] name = { "홍길동", "이영희" }; // 문자여서 String
		int[][] jumsu = { { 90, 85, 40 }, { 100, 35, 75 } }; // 정수여서 int

		int sum; // 변수선언
		double avg; // 변수선언

		for (int i = 0; i < jumsu.length; i++) {
			sum = 0; // 누적시 필요 없으면 넘어가지 않음
			System.out.printf("%s\t", name[i]);
		}

		System.out.println();
		System.out.println("1번===이름======");

		for (int i = 0; i < jumsu.length; i++) {
			sum = 0; // 누적시 필요 없으면 넘어가지 않음
			System.out.printf("%s\t", name[i]);
			for (int j = 0; j < jumsu[i].length; j++) {   // 점수추가
				System.out.printf("%4d", jumsu[i][j]);    // 점수추가 프린트
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("2번=====이름, 점수======");

	for (int i=0; i<jumsu.length; i++) {
		sum=0; // 누적시 필요 없으면 넘어가지 않음
		System.out.printf("%s\t",name[i]);
		for(int j=0; j<jumsu[i].length; j++) {
			System.out.printf("%4d",jumsu[i][j]);
			sum = sum + jumsu[i][j];                     // 합계식
		}
		avg=sum/(double)jumsu[i].length;                 // 평균식
		System.out.printf("%4d %.1f\n",sum,avg);         // 합계,평균 프린트
		
	}
		System.out.println();
		System.out.println("3번===이름,점수,합계,평균=======");

	}// end main()
}
