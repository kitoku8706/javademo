package java006_class.part03;

public class Java068_class {
	public static void main(String[] args) {
		Rect rt = new Rect();
		rt.width=5;
		rt.height=3;
		rt.color="레드";
		
//		System.out.printf("%d %d %s %d %d\n",rt.width,rt.height,rt.color,rt.area(),rt.grith());
//		System.out.println();
		System.out.println("   [결과내역]");
		rt.display();
		System.out.println();
		rt.display01();
		
		System.out.println();  //다음주 엔터
		
		System.out.println("   [결과내역]");
		Rect rc= new Rect();
		rc.width=7;
		rc.height=4;
		rc.color="블루";
		
		rc.display();
		
		
	}//end main()

}
