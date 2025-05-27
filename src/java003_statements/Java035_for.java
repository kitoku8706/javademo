package java003_statements;

public class Java035_for {
	public static void main(String[] args) {
		
//		go: // label
//		for (int i=1; i<=3;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.printf("j=%d\n",j);   //"j=%d\n" \n 줄바꿈
//				if(j==3) {
////					break;
//					j=1/nj=2/nj=3/nj=1/nj=2/nj=3/nj=1/nj=2/nj=3/n
					

//					break go;
					
//break;	j=1j=2j=3j=1j=2j=3j=1j=2j=3					
//break go;	j=1j=2j=3
//continue; j=1j=2j=3j=4j=5j=1j=2j=3j=4j=5j=1j=2j=3j=4j=5
					
		go: // label
		for (int i=1; i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("j=%d",j);   //"j=%d\n" \n 줄바꿈
				if(j==3) {
					
					
					System.out.println( );
				
					
					break;
//					j=1j=2j=3
//					j=1j=2j=3
//					j=1j=2j=3		
					
//					break go;
//					j=1j=2j=3					
					
//					continue;
//					j=1j=2j=3
//					j=4j=5j=1j=2j=3
//					j=4j=5j=1j=2j=3
//					j=4j=5					
				}
			}
		}
	}// end main()
}

// for문에서 continue 를 만나면 현재 수행중인 for문의 증감식으로 이동한다