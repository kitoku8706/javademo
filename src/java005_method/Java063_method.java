package java005_method;

//[출력결과]
//입시총점:135점                                                            // 2025년 전 2024.12.31까지
//입시결과:불합격                                                            // 2025년 이전 2025.12.31까지
public class Java063_method {
	public static void main(String[] args) {
		int toeic = 75;
		int it = 60;
		int sum = total(toeic, it);
		
		System.out.println(" [출력결과]");
		System.out.printf("입시총점:%d점\n", sum);
		System.out.printf("입시결과:%s\n", rs(sum));
	} // end main()
	public static int total(int toeic, int it) {     // int
		// 두 매개변수의 합계를 리턴하는 메소드 구현
		 
		
		return toeic+it;
	}// end total()
	
	public static String rs(int tot) {     //String
		//tot매개변수의 값이 150이상이면 "합격", 미만이면 "불합격" 리턴하는 메소드 구현
		
		return tot >=150?"합격":"불합격";   //삼항연산자
	} //end rs();
  
} // end class








