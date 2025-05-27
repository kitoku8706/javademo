package java004_array;

public class Java050_array {
	
	public static void main(String[] args) {
		
		int[][] num = { { 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 } };
		
		for (int row = 0; row < num.length; row++) { // row 행의 인덱스 처리
			for (int col = 0; col < num[row].length; col++) { // col 열의 인덱스 처리
				if (row % 2 == 0) { 
					System.out.printf("%4d", num[row][col]);
				} else  
					System.out.printf("%4d", num[row][num[row].length-1-col]);   // col =num[row].length-1-col
//				row1
//				col 0	4	5-1-0=4
//				col 1	3	5-1-1=3
//				col 2	2	5-1-2=2
//				col 3	1	5-1-3=1
//				col 4	0	5-1-4=0
				
				}
			System.out.println();
			}
			
		}

	}//end main()


