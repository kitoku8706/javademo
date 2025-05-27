package java005_method;

//[출력결과]
//20(은)는 양수입니다.
//0은 0입니다.
//-20(은)는 음수입니다.


public class Java062_method {
	public static void main(String[] args) {
		process(20);
		process(0);
		process(-20);
		
		
	}//end main()
	public static void process(int num) {     // void
		if(num >0){
			System.out.printf("%d(은) 양수입니다.\n",num);            // if(조건){참일때};else if(조건){참일때};else 거짓일때;
		}else if(num==0){
			System.out.printf("%d(은) 0입니다.\n",num);
		}else
			System.out.printf("%d(은) 음수입니다.\n",num);
		
	
				
	}
}
