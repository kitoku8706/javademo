package java004_array;
//[데이터]

//홍길동   90  85 40
//이영희  100  35 75
//
//[출력결과]
//홍길동   90  85 40 215 71.7
//이영희  100  35 75 210 70.0

public class Java0471_array {
	public static void main(String[] args) {
	String[] name = {"홍길동","이영희"};
	int[][] jumsu = {{90,85,40}, {100,35,75}};
	
	int sum=0;    // 지역변수는 초기값이 없으면 비어 있음
	double avg;
	
	for (int i=0; i<jumsu.length; i++) {
		sum=0; // 누적시 필요 없으면 넘어가지 않음
		System.out.printf("%s\t",name[i]);
		for(int j=0; j<jumsu[i].length; j++) {
			System.out.printf("%4d",jumsu[i][j]);
			sum = sum + jumsu[i][j];
		}
		avg=sum/(double)jumsu[i].length;         //강제 형변환 double 타입
		System.out.printf("%4d %.1f\n",sum,avg);
		
	}
	System.out.println();
	System.out.println("======== for문에서 sum=0를 제외시킬때 합계가 초기화 되지않고 누적되어 계산됨 =====");
	
	sum=0;    // 위에식 누적결과 0 으로 변경 
	
	for (int i=0; i<jumsu.length; i++) {
		//sum=0; // 누적시 필요 없으면 넘어가지 않음
		System.out.printf("%s\t",name[i]);
		for(int j=0; j<jumsu[i].length; j++) {
			System.out.printf("%4d",jumsu[i][j]);
			sum = sum + jumsu[i][j];
		}
		avg=sum/(double)jumsu[i].length;    //강제 형변환 double 타입
		System.out.printf("%4d %.1f\n",sum,avg);
		
	}
	
	
	
}//end main()

}
