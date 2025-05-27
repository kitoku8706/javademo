package java005_method;

public class Java065_method {
	public static void main(String[] args) {
		char[] data= {'a','b','c','d'};
		
		for(int i=0;i<data.length;i++){           // for문 조건을 만족할때까지 반복됨
			System.out.printf("%c",data[i]);    // data 값을 출력
		}
		System.out.println(" 줄바꿈");
		
		char[] alpa=new char[data.length];		// 새로운 alpa 생성 data 와 같은 크기로
			for(int i=0; i<data.length;i++) {         
			
			alpa[i] = data[data.length -1 -i];	// 역순으로 불러오기
			System.out.printf("%c",alpa[i]);    // alpa 값을 출력
			}
			
				

	}//end main()

}
