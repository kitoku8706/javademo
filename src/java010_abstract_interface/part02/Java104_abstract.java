package java010_abstract_interface.part02;

public class Java104_abstract {
	
	public static void main(String[] args) {
		Rect rect = new Rect(10,20);
		System.out.println("사각형의 넓이: "+rect.getArea());
		
		Tri tri = new Tri(1,3);
		System.out.println("삼각형의 넓이: "+tri.getArea());
		

	}//end main()

}
