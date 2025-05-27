package java012_api.part06;

public class Java121_String {
	
	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		
		System.out.println("문자열 길이: "+str.length());  
		System.out.println("대문자: "+str.toUpperCase()); //대문자변경
		System.out.println("대문자: "+str.toLowerCase()); //소문자변경
		System.out.println("문자:"+str.charAt(5));  // 자리에 있는 문자 출력
		System.out.println("인덱스:"+str.indexOf('a')); // 특정문자가 있는 인덱스 번호 출력
		System.out.println("인덱스:"+str.indexOf(97));
		System.out.println("인덱스:"+str.indexOf('a',5));  // a를 찾는데 5번째이후부터
		
		System.out.println("인덱스"+str.indexOf("jsp",7)); //검색 문자열이 없으면 -1을 리턴한다.
		System.out.println("범위"+str.substring(5)); //5번째(,)인덱스부터 마지막까지 문자열 리턴
		System.out.println("범위"+str.substring(2,8)); //2인텍스부터 8미만 인덱스의 문자열을 리턴
		
		
		System.out.println("=================");
		String[] arr = str.split(","); //메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		for(int i=0; i<arr.length; i++)
			System.out.printf("arr[%d]=%s\n",i,arr[i]);


		System.out.println("=================");
		int x =10;
		int y=20;
		
		System.out.printf("x=%d, y=%d, x+y=%d\n",x,y,x+y);
		
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("s1+s2=%s\n",s1+s2);
		
		char[]	data= {'1','2','3','4','5'};
		String s3 = String.valueOf(data);
		System.out.printf("s3=%s\n",s3);
		
		
		String s4=String.valueOf(data,2,3);  // 2인텍스부터 3개 출력 345
		System.out.printf("s4=%s\n",s4);
		
//		String s5 = String.valueOf(data,2,8);  //범위가 벗어남 java.lang.StringIndexOutOfBoundsException: offset 2, count 8, length 5
		
		
		
		
	}//end main()

}
