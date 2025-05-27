package java003_statements;

// 이중 반복문
public class Java033_for {

	public static void main(String[] args) {
		
		
		
// 1번 방법	
		
//		int data;		
//		for (int row = 1; row <= 4; row++) { // 열 4줄      
//			data = 1;
//			for (int col = 1; col <= 5; col++) { // 행 5칸
//				System.out.printf("%4d", data++); // "%4d" 빈칸4칸 자리확보
		
		
// 2번 방법	
		
		for (int row = 1; row <= 4; row++) {	
			for (int col = 1; col <= 5; col++) {
				System.out.printf("%4d", col);
				
				
			}
			System.out.println("\n"); // 줄변경
		}

	}

}
