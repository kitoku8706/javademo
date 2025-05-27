package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 127; // -128~127
		short sNum = 32767; // -32,768 ~ 32,767
		int iNum = 2147483647; // -2,147,483,648 ~ 2,147,483,647
		long lNum = 6L; // 자동 타입변환 6=int 이지만
		float fNum = 2.5F;
		double dNum = 4.5;
		char cData = 'a';
		boolean eNum = true;
		String sData = "java";

		// 데이터를 출력하고 줄바꿈을 한다.
		System.out.println("17줄 " + bNum + "," + sNum);
		System.out.printf("18줄 " + "a");
		System.out.println("19줄 " + bNum + "," + sNum);
		System.out.printf("%d,%d\n", bNum, sNum);

//		  System.out.printf("출력형식", 값1, 값2, 값3...);
//		  
//		  출력기호
//		  %d : 정수(byte, short, int, long)
//		  %f : 실수 (float, double)
//		  %b : 논리 (boolean)
//		  %c : 문자 (char)
//		  %s : 문자열 (String)
//		  %% : %
//		  \n : 줄바꿈
//		  \t : 탭

		System.out.printf("%d %d %d\n", bNum, sNum, iNum, lNum);
		System.out.printf("%d %d %d %d\n", bNum, sNum, iNum, lNum);
		System.out.printf("%5.1f %.2f\n", fNum, dNum);
		System.out.printf("%c %b %s\n", cData, eNum,sData);
		System.out.printf("%d %% %d 몫=%d\n",5,2,5%2); // %나머지 %% 퍼센트기호표기
		
		System.out.printf("%o\n",19); // 8진수 출력 %o(알파뱃O)
		System.out.printf("%x\n",19); // 16진수 출력 %x(알파뱃x)
		System.out.printf("%s\n", Integer.toBinaryString(19)); // 2진수 출력 
		System.out.printf("%5x\n",19); // 16진수,오른쪽정렬, 총자리수 5
		System.out.printf("%-5x\n",19); // 16진수,왼쪽정렬, 총자리수 5
		System.out.printf("%05x\n",19); // 16진수,값이 없는 자리는 0으로 채움		
		
		System.out.print("java");
		System.out.print("/nprogram");
		System.out.println();
		System.out.println("jsp");
		
		
	}

}
