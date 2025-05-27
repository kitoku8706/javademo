
package java009_inheritance.part08;

public class Java100_inheritance {

	public static void main(String[] args) {
		OwnerEngine oEngine = new OwnerEngine();
		System.out.println(oEngine.toString());   // 디폴트 값이 출력
		oEngine.setSpeed(100);
		oEngine.color = "Blue";		
		oEngine.setSeat(4);
		System.out.println(oEngine.toString());
		oEngine.information();
		
		FireEngine fireEngine = new FireEngine();
		System.out.println(fireEngine.toString());   // 디폴트 값이 출력
		fireEngine.color="Red";
		fireEngine.setSpeed(150);    // privat 로 되어있어서 직접 접근이 안되어서 set으로 접근
		fireEngine.setWater(10000);
		System.out.println(fireEngine.toString());
		fireEngine.waterSpread();

	}//end main()

}//end class
