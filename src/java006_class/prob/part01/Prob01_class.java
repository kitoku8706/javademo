package java006_class.prob.part01;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		Circle p1 = new Circle();
		p1.r=10;
		p1.n="자바피자";
		p1.w();
		p1.display();
		//System.out.println(p1.n+"의 면적은 "+p1.w());
		
		Circle p2 = new Circle();
		p2.r=2;
		p2.n="자바도넛";
		p2.display();
//		System.out.println(p2.n+"의 면적은 "+p2.w());
		
				
	}//end main()

}//end class
