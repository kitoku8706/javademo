package java004_array;


// A 65   a 97   차이 32
public class Java053_array {
	public static void main(String[] args) {
		

		char[][] color = { { 'r', 'e', 'd' }, 
				{ 'g', 'r', 'e', 'e', 'n' }, 
				{ 'p', 'i', 'n', 'k' } };
		
			for (int row = 0; row < color.length; row++) {
				for (int col = 0; col < color[row].length; col++) {
//					System.out.printf("%c",color[row][col]);	 // 목록조회				
					System.out.printf("%c",col==0? (char)(color[row][col]-32):color[row][col]);  // 대문자변형  소문자 대문자 차이 32

			}
			System.out.println();

		}
		


	}//end main()

}
