package java012_api.part02;

//Object에서 제공된 equals()메소드 객체만 비교가 가능하다.
//Object에서 제공된 equals()메소드 메모리 주소를 비교한다.


public class Java116_Object_equals {
	
	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		System.out.println(v1==v2);
		System.out.println(v1.equals(v2)); 
		
		
		// 주소를 비교
		System.out.println("=================");
		Member m1 = new Member(10);
		Member m2 = new Member(10);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));  // 오버라이딩으로 인하여 업캐스팅 되어서 
		 
		// 값을 비교
		int k=3;
		int p=3;
		System.out.println(k==p);
		
		System.out.println("=================");
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		// toString() : 메모리에 저장된 문자열 리턴하도록 오버라이딩 해줌
		System.out.println(s1);
		System.out.println(s2.toString());
		
		System.out.println(s1==s2);  //메모리 주소를 비교
		System.out.println(s1.equals(s2)); // 메모리에 저장된 문자열을 비교
		
		String s3 = new String("jsp");
		System.out.println(s1==s3);  //메모리 주소를 비교
		System.out.println(s1.equals(s3)); // 메모리에 저장된 문자열을 비교
		
		
		
		
				
		

	}//end main()

}
