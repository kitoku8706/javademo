package java004_array;

public class Java049_array {
	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, // row 행
				{ 16, 17, 18, 19, 20 } }; // col 열

		for (int row = 0; row < num.length; row++) { // row 행의 인덱스 처리
			for (int col = 0; col < num[row].length; col++) { // col 열의 인덱스 처리
				if (row % 2 != 0) { // row 행이 짝수가 아니면 '-' 처리

					System.out.printf("%4d", num[row][col]);
				} else {
					System.out.printf("%4c", '-');
				}

			}
			System.out.println();
		}

	}// end main()

}
