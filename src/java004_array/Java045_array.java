package java004_array;

public class Java045_array {
	public static void main(String[] args) {
		// 2차원 배열
		// 3행 2열의 2차원 배열
		int[][] num = new int[3][2];
//		System.out.printf("num[%d][%d}=%d\t",0,0,num[0][0]);  // \t 탭키(빈칸)
//		System.out.printf("num[%d][%d}=%d\n",0,1,num[0][1]);  // \n 줄바꿈
//		
//		System.out.printf("num[%d][%d}=%d\t",1,0,num[1][0]);  // \t 탭키(빈칸)
//		System.out.printf("num[%d][%d}=%d\n",1,1,num[1][1]);  // \n 줄바꿈
//		
//		System.out.printf("num[%d][%d}=%d\t",2,0,num[2][0]);  // \t 탭키(빈칸)
//		System.out.printf("num[%d][%d}=%d\n",2,1,num[2][1]);  // \n 줄바꿈

		System.out.println("=================================");
		num[0][0] = 1; // 0행 0열
		num[0][1] = 2; // 0행 1열
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;

//		System.out.printf("num[%d][%d}=%d\t",0,0,num[0][0]);  // \t 탭키(빈칸)
//		System.out.printf("num[%d][%d}=%d\n",0,1,num[0][1]);  // \n 줄바꿈

//		for (int row = 0; row < num.length; row++) {
//			for (int col=0;col<num[row].length; col++){
//				System.out.printf("num[%d][%d}=%d\t", row, col, num[row][col]);
//				
//				}
//			System.out.println();
		for (int row = 0; row < num.length; row++) {
			for (int col=0;col<num[row].length; col++){
//				System.out.printf("num[%d][%d}=%d", row, col, num[row][col]);   // 1방법
//				System.out.printf("%c",col!=num[row].length-1?'\t':'\n');       // 1방법
				System.out.printf("num[%d][%d}=%d%c", row, col, num[row][col],col!=num[row].length-1?'\t':'\n'); // 2방법 축약				
				
				}
			System.out.println();

		}
		

	}// end main()

}
