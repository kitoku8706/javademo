package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint{
	String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void show() {
		System.out.println(x + "," + y+ "," +color);
		
	}

	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void reverse() {
		// TODO Auto-generated method stub
		
	}
	
}
