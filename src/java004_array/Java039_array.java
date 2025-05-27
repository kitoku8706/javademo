package java004_array;

// 배열 
// java배열 값은 데이터만 사용가능 


public class Java039_array {
	
	public static void main(String[] args) {
		int ko =90;
		int en=80;
		int jp=40;
		
		int[] arr; // int[] 배열선언
		
		arr=new int[3];
		// int[] arr=new int[3]; 축약가능
		
		//new키워드를 이용해서 배열생성
		//int 4바이트 x 3개 총12바이트
		//각 요소(element)마다 인텍스가 0부터 생성된다.
		
		arr[0]=90;
		arr[1]=80;
		arr[2]=40;
		
//		System.out.printf("arr[0]=%d\n", arr[0]);
//		System.out.printf("arr[1]=%d\n", arr[1]);
//		System.out.printf("arr[2]=%d\n", arr[2]);	
//		for (int index=0; index<=2;index++) {    // 축약가능
		for (int index=0; index<arr.length;index++) {    // 축약가능	arr.length=3
			System.out.printf("arr[%d]=%d\n", index,arr[index]);
//			System.out.printf("arr[%d]=%d ", index,arr[index]);
		}
		
		System.out.println("배열의 크기:"+arr.length);  //arr.length 배열의 크기(길이)
			
			

	}//end main()

	
}
