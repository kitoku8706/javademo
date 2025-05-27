package java001_basic;

public class Java002_comment {

	public static void main(String[] args) {
		// ctl + / 한라인 주석설정 및 해체
//		 한 라인 주석

		int a = 2; // 변수 선언

	
		/*
		 * 여러라인 주석처리
		 * ctrl + shift + / 설정
		 * ctrl + shift + \ 해체
		 */
		
		System.out.println(a + 3);
		
		process();
		
	} // end main()
	
	public static void process() {
		System.out.println("process method");
	} // end process
	
}
